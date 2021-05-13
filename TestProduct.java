package interFace;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class TestProduct {

	public static void main(String[] args) {

		// Notebook具備兩個型態，一個是本身的Notebook, 另一個是繼承來的Product。
		Notebook nb = new Notebook("Asus", 30000, 365);
		System.out.println(nb.desc());
		
		Product item = nb;   
		System.out.println(item instanceof Notebook);
		if (item instanceof Notebook) {
			Notebook nb1 = (Notebook)item;
			System.out.println("保固:"+nb1.getWarranty());
		}
		
//		Food f1 = (Food)item;
		
//		nb.getWarranty();
//		nb.getName();
//		nb.getPrice();
		// 先取得日歷Calendar再取得日期Date,月份0起算
//		GregorianCalendar calendar = new GregorianCalendar(2021, Calendar.MAY, 13);
		Date date = Product.getDate(2021, 5, 14);
		Food food = new Food("肉鬆", 200, date);
		System.out.println(food.desc());
		
		SimCard sim = new SimCard("日本遊漫遊", 600, Product.getDate(2021, 5, 14));
		

//		Product[] items = new Product[] {nb, food};
		Product[] items = {nb, food, sim};
		buy(items);

	}

	public static void buy(Product[] ps) {
		int sum = 0;
		for (Product eachItem : ps) {
			System.out.println("買入:" + eachItem.desc());
			if (eachItem instanceof Expirable) {
				Expirable exp = (Expirable)eachItem;
				Date now = new Date();//取得電腦現在時間
				if (exp.最後期限().before(now)) {
					System.out.println("已過期");
					continue;
				}
			}
			sum = sum + eachItem.getPrice();
		}
		System.out.println("總金額:" + sum);

	}
}

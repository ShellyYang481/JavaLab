package extend;

public class TestProduct {

	public static void main(String[] args) {
		
		
		Notebook nb = new Notebook("Asus", 30000, 365);
		System.out.println(nb.desc());
		
		System.out.printf("廠牌:%s,價錢:%d,保固天數%d",nb.getName(),nb.getPrice(),nb.getWarranty());
		
		
//		
//		Product a = new Product("冷氣",50000);
//		System.out.println(a.name);

	}

}

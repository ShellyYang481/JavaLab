package interFace;

public class Notebook extends Product implements Warrantable{
	//Notebook具備三種型態:Notebook,Product,Warrantable
	@Override
	public int 保固天數() {
		return warranty;
	}


	public int warranty;
	
	public Notebook(String name, int price, int warranty) {
		//super();//compiler會自動加一個父類別的建構方法
		super(name,price);
		this.warranty = warranty;
//		this.name = name;
//		this.price = price;
//		setName(name);
//		setPrice(price);
	}
	@Override
	public String desc() {
		String info = super.desc();
		return String.format("%s,!保固:%d天", info ,warranty);
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	
	
}

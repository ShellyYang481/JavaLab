package equals;

import encap.Car;

public class TestEquals {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("001");
		Employee e2 = new Employee(null);
		
		
		System.out.println(e1==e2);//比較兩者記憶體位置
		System.out.println(e1.equals(e2));//f3 比較記憶體位置
		e1=null;
		System.gc();
		
		System.out.println(e2);
		System.out.println(e2.toString());
		
	}

}

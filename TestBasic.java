import com.sun.xml.internal.bind.v2.TODO;

public class TestBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 20 ,j = 2,k = 3;
		System.out.println("abc=" + i);
		System.out.println(2322222222L);
		
		long a = 2000000000;
		long b = a + a;
		System.out.println("b="+b);
		
		char c = '中';
		System.out.println(c);
		
		boolean d = false;
		System.out.println(d);
		
		System.out.println("\"");
		
		System.out.println("\"Hello World\"");
		
		System.out.println("\\\\Hello World\\\\");
		
		int x = 9;
		int y = 3;
		int z = x + y;
		System.out.println("z="+ z);
		
		System.out.println(x % y);
		
		double cc = 8.3453;
		int aa = (int)cc;
		System.out.println("aa=" + aa);
		
		int age = 17;
		boolean isAdult = (age > 18 && age < 30);
		System.out.println (isAdult);
		System.out.println(age>18 ? "成年" : "未成年");
		
		int sales = 2000;
		int salary =200;
		salary = sales>1000 ? salary + 10 : salary - 10;
		System.out.println("薪水: " + salary);
		

		
		
	}

}

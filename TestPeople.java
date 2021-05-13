package func;

import sun.nio.cs.ext.DoubleByteEncoder;

public class TestPeople {

	public static void main(String[] args) {
		
		People p = new People();
		p.height = 1.7;
		p.weight = 70;
	
		System.out.printf("BMI=%.2f \r\n",p.getBMI());
		
		System.out.println("過重BMI=" + People.overWeightBMI);
		
		double bmi = People.BMI(1.7, 70);
		System.out.println("Static BMI=" + bmi );
		
		System.out.println(String.join("-","a","Hello","World"));
	
		

	}

}

package array;

public class ArrayLab {

	public static void main(String[] args) {
		
		double [] x = {1.1, 2.0, 1.2, 1.4, 0.5, 6.0};
		
		double min = 99999.0;
		double max = 0.0;
		double sum = 0.0;
		
		
		for (int i = 0 ; i<x.length ; i++);{
			if (x[i]>max){
			x[i]=max;
			}
			
			if (x[i]<min){
			x[i]=min;
			}
			
			sum = sum + x[i];
		
	}
		System.out.println("最大值是:" + max);
		System.out.println("最小值是:" + min);
		System.out.println("平均值是:" + sum);
		

}
}
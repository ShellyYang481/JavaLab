package func;


public class People {
	// static都不需要物件，也無法使用物件屬性
	static double overWeightBMI = 24.0; // static代表跟著class，避免每new一個物件就增加一個記憶體空間。

	public static double BMI(double h, double w) {
		return w / (h * h);
	}

	// 下方都是物件屬性跟方法，都需要new才能使用
	double height;
	double weight;

	public double getBMI() { // getBMI是一個物件的方法
		double BMI = People.BMI(height, weight);
		return BMI;
	}

}

package array;

public class ChristmasTree {

	public static void main(String[] args) {
		int n = 4;
		int i, j, k;
		for (i=1 ; i<=n ; i++) {
			for (j=0 ; j<=n-i ; j++) {
				System.out.println(" ");
				for (k=1 ; k<= (2*i-1) ; k++) {
					System.out.print("*");
				}
			}
				
		}
		
	

	}

}

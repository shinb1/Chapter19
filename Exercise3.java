import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		double x = 0;
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter x: ");
		x =reader.nextDouble();
		eToThex(x);
	}

	public static void eToThex(double x){
		double term = 1.0;
		double sum = 1.0;

		for (int i = 1; term >= Math.pow(10,-12); i++) {
			term = Math.pow(x,i)/factorial(i);
			sum = sum + term;
			System.out.println("n: " + i + "\tterm: " + term + "\tsum: " + sum);

		}

		System.out.println("\tmy\te^x: " + sum);
		System.out.println("real\te^x: " + Math.exp(x));

		return;
	}
	
    public static int factorial(int n) {
        int fact = 1; 
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}


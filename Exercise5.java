import java.util.Scanner;

public class Exercise5 {
	
	public static void main(String[] args) {
		int n = 0;
		Scanner reader = new Scanner(System.in);
		n = reader.nextInt();
		evenOdd(n);
	}

	public static void evenOdd(int n) {
		while (n > 1) {
			if (n % 2 == 0) {
				System.out.println(n + "\t(even, next value is " + n + "/2)");
				n = n /2;
			} else {
				System.out.println(n + "\t(odd, next value is 3*" + n + "+1)");
					n = (3 * n) + 1;
			}
		}

		System.out.println("1\t(stop calculation)");

		return;
	}
}

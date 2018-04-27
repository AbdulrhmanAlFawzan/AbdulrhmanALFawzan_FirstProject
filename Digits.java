import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number (-1 to end): ");
		int num = s.nextInt();
		int digit;
		int counter = 0;
		while (num != -1) {
			while (num != 0) {
				counter++;
				digit = num % 10;
				System.out.println("digit" + counter + " = " + digit);
				num = num / 10;
			}
			System.out.print("Enter a number (-1 to end): ");
			num = s.nextInt();
			counter = 0;
		}
		System.out.println("Thanks, goodbye");
	}

}

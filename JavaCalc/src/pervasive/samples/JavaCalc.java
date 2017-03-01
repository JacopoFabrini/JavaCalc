package pervasive.samples;

import java.util.Scanner;

public class JavaCalc {

	public static void main(String[] args) {
		// Questo è il modo corretto con cui utilizzare scanner
		try (Scanner scanner = new Scanner(System.in)) {
			
			// Modo più intelligente di acquisizione informazioni
			System.out.println("Enter an expression of the form 3 * 5");
			
			double n1 = scanner.nextDouble();
			String operation = scanner.next();
			double n2 = scanner.nextDouble();

			switch (operation) {
			case "+":
				System.out.println("Your answer is " + (n1 + n2));
				break;
			case "-":
				System.out.println("Your answer is " + (n1 - n2));
				break;
			case "*":
				System.out.println("Your answer is " + (n1 * n2));
				break;
			case "/":
				System.out.println("Your answer is " + (n1 / n2));
				break;
			default:
				System.out.println("Wrong operator!");
				break;
			}
		}

	}

}

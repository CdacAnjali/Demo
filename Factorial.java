package Lab3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please enter the number ou want to factorial: ");
				 int num = input.nextInt();
				 int result = 1;
				 for(int i = 1; i <= num; i++) {
				  result *= i;
				  
				}
				System.out.println("The result is : "+   " "+ result);
		}
	}

}

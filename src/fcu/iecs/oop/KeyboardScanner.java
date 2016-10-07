package fcu.iecs.oop;
import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		float number; 
		String name;
		double sum;
		
		Scanner scanner = new Scanner(System.in); //		
		
		System.out.print("Enter a integer:");
		num = scanner.nextInt();
		
		System.out.print("Enter a float point number:");
		number = scanner.nextFloat();
		
		System.out.print("Enter a you name:");
		name = scanner.next();
		
		sum= num * number;
		
		System.out.print("Hi " + name + " the multiplication of " +  num + " and " +  number + " is " );
		System.out.printf("%8.2e ",  sum);
		
	}

}

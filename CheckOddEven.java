package fcu.iecs.oop;
import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args) {
	  int num;
	  
	  Scanner out = new Scanner(System.in);
	  
	  System.out.print("Enter a integer: ");
	  num = out.nextInt();
	  
	  if(num % 2 == 0)
		  System.out.print("The input integer is Even Number.");
	  else
		  System.out.print("The input integer is Odd Number");
	  
	
	}

}


package Basic;

import java.util.Scanner;

public class TryandCatch {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 try{
		 System.out.println("Number 1: ");
		 int number1 = input.nextInt();
		  System.out.println("Number 2: ");
		 int number2 = input.nextInt();
		
		 int sum = number1/number2;
		 System.out.println(sum);
		 }catch(Exception e){
			 System.out.println("You can not do that");
		 }
	}
}

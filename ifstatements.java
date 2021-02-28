package Basic;

import java.util.Scanner;

public class ifstatements {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("PLease adress the students final grade and GPA");	
		int grade = input.nextInt();
		double GPA = input.nextDouble();
	
		if(grade <= 0 && grade >= 100){
			System.out.println("Correct");
			if(grade > 83){
				System.out.printf("Your final grade is a %d, keep up the good work",grade);
			}else{
				System.out.printf("%d, that needs some work", grade);
			}
		}else
		{
			System.out.printf("You finished with a %d, that is unexceptable",grade);
		
		}
		if(GPA <= 3.00 && GPA >= 4.00){
			System.out.println("congrats, that a good GPA");
		}
		if(GPA > 3.50){
			System.out.printf("Your final GPA is %f, well done",GPA);
		}
		else{
			System.out.printf("Your GPA is a %f, thats out standing",GPA);
		}
	}
}

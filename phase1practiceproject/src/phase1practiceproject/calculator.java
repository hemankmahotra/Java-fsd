package phase1practiceproject;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Arithematic Calculator");
		System.out.println("1.Additon(+)");
		System.out.println("2.Subtraction(-)");
		System.out.println("3.Division(/)");
		System.out.println("4.Multiplication(*)");
		
		double num1, num2, result;
		int choice;
		
		System.out.println("Which arithematic operation to be performed: ");
		choice= sc.nextInt();
		
		System.out.println("Enter first number: ");
		num1= sc.nextDouble();
		
		System.out.println("Enter Second number: ");
		num2= sc.nextDouble();
		
		switch(choice) {
		case 1:
			result=num1+num2;
			System.out.println("Addition of these numbers is " +result);
			break;
			
		case 2:
			result=num1-num2;
			System.out.println("Subtraction of these numbers is " +result);
			break;
			
		case 3:
			if(num2 ==0) {
               System.out.println("Error Division by 0 is not allowed");
			}
			else {
			result=num1/num2;
			System.out.println("Division of these numbers is " +result);
			}
			break;
			
		case 4:
			result=num1*num2;
			System.out.println("Division of these numbers is " +result);
			break;
			
		default:
			System.out.println("Invalid option, choose a valid option");
			break;
			
		}
		sc.close();

	}

}

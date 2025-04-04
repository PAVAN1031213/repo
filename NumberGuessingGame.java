package studyopedia;

import java.util.Scanner;

public class NumberGuessingGame {
	
	public static void number(){
		
		System.out.println("Enter number between 1 to 100 : ");
		Scanner sc=new Scanner(System.in);
		
		int num=1+(int)(Math.random()*100);
		
		int k=5;
		System.out.println("you have only 5 attempt to guess a number ");
		
		for(int i=0; i<k; i++) {
			System.out.print("guess your number : ");
			int user=sc.nextInt();
			if(user==num) {
				System.out.println("congradulation you guess a currect number...... ");
				sc.close();
				return;
			}
			
			else if(user>num) {
				System.out.println("your enter number is grater then the compurt number");
			}
			
			else {
				System.out.println("your enter number is less then the compurt number");
			}
		}
		System.out.println("your 5 attempt are compated, correct is "+num);
		sc.close();
	}
	
	public static void main(String[] args) {
		
		number();
	}

}

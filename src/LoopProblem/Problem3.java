package LoopProblem;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
/*		Scanner input = new Scanner(System.in);
		System.out.println("Enter a input");
		int a ;
		a = input.nextInt();
		System.out.println("The input is " +a);
		
*/
		
/*
		System.out.println("Hello Java Scanner \n");
		
		System.out.println("Enter a Number Please");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("Input another number");
		int b = input.nextInt();
		int sum = a + b;
		System.out.println("Sum is : " +sum);
*/
		  Scanner console = new Scanner(System.in);
	        int num;
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	        System.out.println("Multiplication Table of " + num);
	        
	        for(int i = 1; i<=10; i++) {
	        	 System.out.println(num +" x " + i + " = " + (num*i) );
	        }
		
		
	}

}

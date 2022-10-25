package com.codingdojo.project.gymtracker;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JamesBucskoTestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JamesBucskoTestsApplication.class, args);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 1st number ::");
		int num1 = sc.nextInt();
		System.out.println("Enter your 2nd number ::");
		int num2 = sc.nextInt();
		System.out.println("Enter your 3rd number ::");
		int num3 = sc.nextInt();
		System.out.println("Enter your 4th number ::");
		int num4 = sc.nextInt();
		if(num1 == num2 && num2 == num3 && num3 == num4) {
			System.out.println("Numbers are equal!");
		}
		else {
			System.out.println("Numbers are not equal!");
		}
		
		
		
//		int n = 5;
//		for(int i=0; i<11; i++) {
//			 System.out.println(n*i);
//		}
//		String str = "Hello";
//		StringBuilder str2 = new StringBuilder();
//		str2.append(str);
//		str2 = str2.reverse();
//		System.out.println(str2);
		
		
		
		
//		   Multiplies 2 numbers
//		Scanner sc = new  Scanner(System.in);
//		System.out.println("Enter the value of the first number");
//		int a = sc.nextInt();
//		System.out.println("Enter the value of the first number");
//		int b = sc.nextInt();
//		int result = a*b;
//		System.out.println("Product is "+result);
		
	}

}

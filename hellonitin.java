package com.hello.java;
import java.util.Scanner;
public class Hellonitin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
			//int nitin;
			//nitin = 2;
			//System.out.print(nitin);
	Scanner nitin = new Scanner(System.in);	
	double fnum, snum, answer;
	System.out.println("Enter first num");
	fnum = nitin.nextDouble();
	System.out.println("Enter second num");
	snum = nitin.nextDouble();
	answer = fnum + snum;
	System.out.println(answer);
	}

}


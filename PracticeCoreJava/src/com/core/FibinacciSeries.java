package com.core;

import java.util.Scanner;

public class FibinacciSeries {

	public static void main(String[] args) {
	//Scanner scan=new Scanner(System.in);
	//System.out.println("Enter size of array");
	///int fiboLen= scan.nextInt();
	//System.out.println("Enter elements into array");
	int maxNumber=10;
	int previous=0;
	int next=1;
	int fibo[]=new int[maxNumber];
	fibo[0]=previous;
	fibo[1]=next;
	System.out.println(fibo[0]+" "+fibo[1]);
	for(int i=2;i<maxNumber;i++) {
		int sum= previous+next;
		previous=next;
		next=sum;
		fibo[i]=sum;
		System.out.println(fibo[i]);
	}

}
}

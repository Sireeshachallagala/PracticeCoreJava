package com.core;

import java.util.ArrayList;

public class LambdaIteration {
	public static void main(String[] args) {
		/*
		 * ArrayList<String> al=new ArrayList<String>(); al.add("Hello"); al.add("hi");
		 * al.add("how"); al.add("are"); al.add("you?"); al.forEach(als->
		 * printList(als));
		 */
		for(int i=1;i<=5;i++){
			int temp=i;
			System.out.println(i);
			System.out.println(temp+""+i);
			}
	}
public static void printList(String al) {
	System.out.println(al);
}
}

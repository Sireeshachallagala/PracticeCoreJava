package com.core;

import java.util.Scanner;

public class RemoveVowels {
public static String removeVowel(String word) {
	 String wordV=word.replaceAll("[aeiouAEIOU]", " ");
	 return wordV.replaceAll("\\s","");
	
}
	public static void main(String[] args) {
		
		try {
		Float f1=new Float("3.0");
		int a1= f1.intValue();
		double b=f1.doubleValue();
		Byte b1=f1.byteValue();
		System.out.println(a1+b+b1);
		}catch(NumberFormatException e) {
			System.out.println("Bad Number");
		}
		

	}

}

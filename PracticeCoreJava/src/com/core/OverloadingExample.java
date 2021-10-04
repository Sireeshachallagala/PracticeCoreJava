package com.core;

public class OverloadingExample {
	

	public void m1(Object o) {
		System.out.println("Object Method "+o);
	}
	public void m1(String s) {
		System.out.println("String Method "+s);
	}
	public static void main(String[] args) {
		String s1=new String("Durga");
		//String s2=new String("Durga"); 
		String s2=s1;
		StringBuffer sb1=new StringBuffer("Durga");
		StringBuffer sb2=new StringBuffer("Durga");
		OverloadingExample oe=new OverloadingExample();
		Object o=new Object();
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		//oe.m1(o);
		//oe.m1("hello");
		//oe.m1(null);
	}

}

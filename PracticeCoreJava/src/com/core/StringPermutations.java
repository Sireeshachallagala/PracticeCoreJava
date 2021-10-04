package com.core;

public class StringPermutations {
	public void permutation(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans+"");
			return;
		}
		//char[] p=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			String ros=s.substring(0,i)+s.substring(i+1);
				//System.out.println(s.substring(0,i)+s.substring(i+1));
				permutation(ros,ans+ch);
				}
				//return "";
	}

	public static void main(String[] args) {
		StringPermutations sp=new StringPermutations();
		String s="abb";
		sp.permutation(s,"");

	}

}

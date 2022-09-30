package com;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String input=sc.nextLine().toLowerCase();
		String result="";
		HashSet<Character> test=new HashSet<>();
		for(int i=0;i<input.length();i++)
		{
			char t=input.charAt(i);
			if(test.contains(t))
			{
				result+=t;
				result+=",";
			}
			else
			{
				test.add(t);
			}
		}
		System.out.println(result.subSequence(0, result.length()-1));
	}

}

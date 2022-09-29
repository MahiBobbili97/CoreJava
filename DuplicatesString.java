package com;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="";
		System.out.println("Enter a string");
		Scanner sc= new Scanner(System.in);
		a=sc.nextLine();
		int count=0;
		HashSet<Character> test= new HashSet<>();
		for(int i=0;i<a.length();i++)
		{
			
			if(test.contains(a.charAt(i)))
			{
				count=1;
				System.out.println("Not unique");
			}
			else
			{
				test.add(a.charAt(i));
			}
		}
		if(count==0)
		{
			System.out.println("Unique");
		}
	}

}

package com;

import java.util.Scanner;

public class Revere_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string:");
		String input=sc.nextLine();
		String result="";
		int j=0;
		for(int i=input.length()-1;i>=0;i--)
		{
			result+=input.charAt(i);
		}
		System.out.println(result);

	}

}

package com;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String 1:");
		String one=sc.nextLine();
		System.out.println("Enter String 2");
		String two=new StringBuffer(sc.nextLine()).reverse().toString();
		int count=0;
		//System.out.println(two);
		if(one.length()!=two.length())
		{
			count=1;
			System.out.println("Rotation not possible");
		}
		else
		{
			if(!one.equalsIgnoreCase(two))
			{
				count=1;
				System.out.println("Rotation not possible");
			}
		}
		if(count==0)
		{
			System.out.println("Rotation possible");
		}
	}

}

package com;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string 1:");
		Scanner sc=new Scanner(System.in);
		String one=sc.nextLine();
		System.out.println("Enter String 2:");
		String two=sc.nextLine();
		char[] one_ch=one.toCharArray();
		char[] two_ch=two.toCharArray();
		int count=0;
		if(one.length()!=two.length())
		{
			System.out.println("Not Anagram");
		}
		else
		{
			Arrays.sort(one_ch);
			Arrays.sort(two_ch);
			for(int i=0;i<one_ch.length;i++)
			{
				if(one_ch[i]==two_ch[i])
				{
					continue;
				}
				else
				{
					System.out.println("Not Anagram");
					count=1;
					break;
				}
			}
			if(count==0)
			{
				System.out.println("Anagram");
			}
		}

	}

}

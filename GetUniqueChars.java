package com;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class GetUniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String input=sc.nextLine().toLowerCase();
		String result="";
		HashMap<Character,Integer> test=new HashMap<>();
		for(int i=0;i<input.length();i++)
		{
			char t=input.charAt(i);
			if(test.containsKey(t))
			{
				
				test.put(t, test.get(t)+1);
			}
			else
			{
				test.put(t, 1);
			}
		}
		for(Entry<Character,Integer> now: test.entrySet())
		{
			if(now.getValue()==1)
			{
				System.out.println(now.getKey());
			}
		}
	}

}

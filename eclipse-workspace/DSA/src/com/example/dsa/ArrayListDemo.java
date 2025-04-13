package com.example.dsa;
import java.util.*;

public class ArrayListDemo
{
	public static void main(String a[])
	{
		ArrayList<String> stngs = new ArrayList<>();
		System.out.println("Enter a set of strings, type stop to finish");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		while(!input.equalsIgnoreCase("stop"))
		{
			stngs.add(input);
			input = sc.nextLine(); //reads next line
		}
		sc.close();
		System.out.println("You entered below:");
		for(int i=0;i<stngs.size();i++)
		{
			System.out.println(stngs.get(i));
		}
	}
}
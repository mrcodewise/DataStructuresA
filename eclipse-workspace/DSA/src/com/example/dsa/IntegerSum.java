package com.example.dsa;
import java.util.*;

public class IntegerSum {
	public static void main(String a[])
	{
		ArrayList<Integer> nums = new ArrayList<>();
		System.out.println("Enter a number n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //reads the Integer
		int counter = 0;
		while(counter<n)
		{
			System.out.println("Enter an integer");
			int num = sc.nextInt();		
			nums.add(num);
			counter+=1;
		}
		sc.close();
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			sum = sum+nums.get(i);
		}
		System.out.println(sum);
	}
}

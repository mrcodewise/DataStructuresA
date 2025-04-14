package com.example.dsa;
import java.util.*;
public class RemoveEvens {
	/*
	public static void main(String a[])
	{
		List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		nums.removeIf(n -> n % 2 == 0); //lambda expression which mean "For each number n in the list, if n%2==0, removes it from he list."
		System.out.println("Resultant List: "+nums);
	}
	*/
	
	public static void main(String args[])
	{
		List<String> stngs = new ArrayList<>(Arrays.asList("","Lambda","","Expression"));
		stngs.removeIf(n->n.isEmpty());//checks for each element n  and removes if i'ts empty
		System.out.println("Resultant List: "+stngs);
	}

}

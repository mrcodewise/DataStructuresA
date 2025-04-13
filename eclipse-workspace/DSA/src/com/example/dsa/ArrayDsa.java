package com.example.dsa;
import java.util.*;

public class ArrayDsa {
	public static void main(String args[])
	{
		/*int a[] = new int[2];
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		//System.out.println(a[2]);
		for(int i=0;i<a.length;i=i+1)
		{
			System.out.println("I am the " + i+"th element of the array: "+a[i]);
		}*/
		ArrayList<Integer> a = new ArrayList<>(); //Dynamic Array
		a.add(2);
		a.add(4);
		a.add(6);
		for(int i =0;i<a.size();i = i+1)
		{
			System.out.println("This is a dynamic array with a["+i+"]: "+a.get(i));
		}
		
	}

}

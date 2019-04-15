package com.ds.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearSearch {
	static List<Integer> list;
	static int[] array;
	
	public void linearSearchList(int x)
	{
		for(int i = 0 ;i<list.size();i++)
		{
			if(list.get(i)==x)
			{
				System.out.println(x + " is found at index " + i);
				return;
			}
		}
		System.out.println(x + " is not found in the list");
	}
	
	public void linearSearchArray(int x)
	{
		for(int i = 0 ;i<array.length;i++)
		{
			if(array[i]==x)
			{
				System.out.println(x + " is found at index " + i);
				return;
			}
		}
		System.out.println(x + " is not found in the array");
	}

	public static void main(String[] args) {
		
		LinearSearch ls = new LinearSearch();
		list = new ArrayList<Integer>(Arrays.asList(2,6,4,1,9,3,7,15,49,99,11,42,76,67));
		ls.linearSearchList(67);
		array = new int[]{2,6,4,1,9,3,7,15,49,99,11,42,76,67};
		ls.linearSearchArray(1);
	}

}

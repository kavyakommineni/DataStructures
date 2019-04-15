package com.ds.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
	
	static List<Integer> list;
	
	public void insertionSort()
	{
		for(int i = 1; i<list.size(); i++)
		{
			int j = i-1;
			int key = list.get(i);
			while(j>=0 && list.get(j)>key)
			{
				list.set(j+1, list.get(j));
				j--;
			}
			list.set(j+1, key);
		}
	}

	public void printList()
	{
		list.stream().forEach(System.out::println);
	}

	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		list = new ArrayList<Integer>(Arrays.asList(2,6,4,1,9,3,7,15,49,99,11,42,76,67));
		is.insertionSort();
		is.printList();
	}

}

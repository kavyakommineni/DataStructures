package com.ds.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

	static List<Integer> list;
	
	public void selectionSort()
	{
		int min,p=-1;
		for(int i = 0; i< list.size();i++)
		{
			min = list.get(i);
			p=i;
			for(int j=i+1; j<list.size();j++)
			{
				if(min>list.get(j))
				{
					min = list.get(j);
					p = j;
				}
			}
			if(i!=p)
			{
				int temp = list.get(i);
				list.set(i, list.get(p));
				list.set(p, temp);
			}
		}
	}
	
	public void printList()
	{
		list.stream().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		list = new ArrayList<Integer>(Arrays.asList(2,6,4,1,9,3,7,15,49,99,11,42,76,67));
		ss.selectionSort();
		ss.printList();
	}

}

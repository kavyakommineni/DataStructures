package com.ds.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

	static List<Integer> list;
	
	public void bubblesort()
	{
		for(int i = 0; i<list.size();i++)
		{
			for(int j = i; j<list.size();j++)
			{
				if(list.get(i)>list.get(j))
				{
					swap(i,j);
				}
			}
		}
	}
	
	public void swap(int i, int j) {
		int temp;
		temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	public void printList() {
		list.stream().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		list = new ArrayList<Integer>(Arrays.asList(2,6,4,1,9,3,7,15,49,99,11,42,76,67));
		bs.bubblesort();
		bs.printList();
	}
}

package com.ds.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
	
	static List<Integer> list;
	static int[] array;
	
	public void binarySearchList(int x, int low, int high)
	{
		boolean flag = false;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(list.get(mid)==x)
			{
				System.out.println(x + " is found at index " + mid);
				flag = true;
				return;
			}
			else if(x > list.get(mid))
			{
				low = mid + 1;
			}
			else if(x < list.get(mid))
			{
				high = mid - 1;
			}
		}
		if(!flag)
		{
			System.out.println(x + " is not found in the list");
		}
	}
	
	public void binarySearchArray(int x, int low, int high)
	{
		boolean flag = false;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(array[mid]==x)
			{
				System.out.println(x + " is found at index " + mid);
				flag = true;
				return;
			}
			else if(x > array[mid])
			{
				low = mid + 1;
			}
			else if(x < array[mid])
			{
				high = mid - 1;
			}
		}
		if(!flag)
		{
			System.out.println(x + " is not found in the array");
		}
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		list = new ArrayList<Integer>(Arrays.asList(3,6,9,12,45,56,78,93,100));
		array = new int[] {3,6,9,12,45,56,78,93,100};
		int low =0;
		int high = list.size()-1;
		bs.binarySearchList(80, low, high);
		bs.binarySearchArray(56, low, high);
	}

}

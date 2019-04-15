package com.ds.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
	
	public List<Integer> mergeSort(List<Integer> list, int low, int high)
	{
		if(low<high)
		{
			int mid = (low + high)/2;
			mergeSort(list,low,mid);
			mergeSort(list,mid+1,high);
			merge(list,low,mid,high);
		}
		return list;
	}
	
	public void merge(List<Integer> list, int low, int mid, int high)
	{
		 int leftArraySize = mid - low + 1; 
	     int rightArraySize = high - mid; 
		List<Integer> ll = new ArrayList<Integer>();
		List<Integer> rl = new ArrayList<Integer>();
		
		for(int  i = 0; i<leftArraySize;i++)
		{
			ll.add(list.get(low+i));
		}
		
		for(int i = 0; i<rightArraySize; ++i)
		{
			rl.add(list.get(mid+1+i));
		}
		
		int i=0, j=0, k=low;
		
		while(i<leftArraySize && j<rightArraySize)
		{
			if(ll.get(i)<=rl.get(j))
			{
				list.set(k, ll.get(i));
				i++;
			}
			else
			{
				list.set(k, rl.get(j));
				j++;
			}
			k++;
		}
		while(i < leftArraySize)
		{
			list.set(k, ll.get(i));
			i++;
			k++;
		}
		while(j < rightArraySize)
		{
			list.set(k, rl.get(j));
			j++;
			k++;
		}
	}

	public void printList(List<Integer> list)
	{
		list.stream().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		List<Integer> list = new ArrayList<Integer>();
		list = new ArrayList<Integer>(Arrays.asList(2,6,4,1,9,3,7,15,49,99,11,42,76,67));
		int low = 0;
		int high = list.size()-1;
		list = ms.mergeSort(list,low,high);
		ms.printList(list);

	}

}

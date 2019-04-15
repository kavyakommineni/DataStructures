package com.ds.practice;

public class QuickSort {

	static int[] arr;
	
	public void quickSort(int[] arr,int low, int high)
	{
		if(low<high)
		{
			int q = partition(arr,low,high);
			quickSort(arr,low, q-1);
			quickSort(arr,q+1, high);
		}
	}
	
	public int partition(int[] arr,int p, int q)
	{
		int pivot = arr[q];
		int j=p-1;
		
		for(int  i = p; i < q; i++)
		{
			if(arr[i]<=pivot)
			{
				j=j+1;
				swap(arr,i,j);
			}
		}
		swap(arr,j+1,q);
		
		return j+1;
	}
	
	public void swap(int[] arr,int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		arr = new int[] { 5, 8, 6, 4, 9, 1, 3, 7 };
		int low = 0;
		int high = arr.length - 1;

		QuickSort qs = new QuickSort();
		qs.quickSort(arr,low, high);

		for (int i : arr) {
			System.out.println(i);
		}

	}

}

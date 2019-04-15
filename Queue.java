package com.ds.practice;

public class Queue {
	
	int rear=-1,front=0,count=0;
	static final int MAX=100;
	int[] array = new int[MAX];
	
	static Queue queue = new Queue();
	
	public void enqueue(int data)
	{
		if(count!=MAX)
		{
			if(rear==MAX-1)
			{
				rear=-1;
			}
			rear++;
			array[rear]=data;
			count++;
		}
		else
		{
			System.out.println("Queue is full");
		}
	}
	
	public void dequeue()
	{
		if(count!=0)
		{
			if(front==MAX-1)
			{
				front=0;
			}
			int n = array[front];
			System.out.println(n + " is dequeued");
			front++;
			count--;
		}
		else
		{
			System.out.println("Queue is empty");
		}
	}
	
	public static void main(String[] args) {
		
		queue.enqueue(1);
		queue.enqueue(9);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(5);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

	}

}

package com.ds.practice;

public class QueueWithLL {

	Node head;
	
	int front, rear, count;
	public static final int MAX = 100;
	
	static QueueWithLL queue = new QueueWithLL();
	
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
		}
	}
	
	public QueueWithLL() {
		front = 0;
		rear = -1;
		count = 0;
	}
	
	public void enqueue(int data)
	{
		if(count==MAX)
		{
			System.out.println("Queue full");
		}
		else
		{
			if(rear==MAX-1)
			{
				rear = -1;
			}
			Node node = new Node(data);
			node.next = null;
			
			if(queue.head==null)
			{
				queue.head = node;
				count++;
			}
			else
			{
				Node currNode = queue.head;
				
				while(currNode.next!=null)
				{
					currNode = currNode.next;
				}
				currNode.next = node;
				rear++;
				count++;
			}
		}
	}
	
	public void dequeue()
	{
		if(count == 0)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			if(front==MAX)
			{
				front = 0;
			}
			Node x = queue.head;
			
			queue.head = x.next;
			
			System.out.println(x.data + " is popped out");
			x = null;
			front--;
			count--;
		}
		
	}
	
	public static void main(String[] args) {
		
		queue.enqueue(1);
		queue.enqueue(2);
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

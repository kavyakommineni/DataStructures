package com.ds.practice;

public class StackWithLL {

	Node head;
	static int top;
	public static final int MAX=100;
	static StackWithLL stack = new StackWithLL();
	
	static class Node
	{
		Node next;
		int data;
		Node(int data)
		{
			this.data = data;
		}
	}
	
	StackWithLL()
	{
		top = -1;
	}
	
	public void push(int x)
	{
		if(top==MAX)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			Node node = new Node(x);
			node.next = null;
			
			if(stack.head == null)
			{
				stack.head = node;
				top++;
			}
			else
			{
				Node currNode = stack.head;
				while(currNode.next != null)
				{
					currNode = currNode.next;
				}
				currNode.next = node;
				top++;
			}
		}
	}
	
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("No elements in the stack");
		}
		else if(top==0)
		{
			stack.head = null;
			top--;
		}
		else
		{
			Node currNode = stack.head;
			Node prevNode = currNode;
			while(currNode.next!=null)
			{
				prevNode = currNode;
				currNode = currNode.next;
			}
			prevNode.next = null;
			top--;
		}
	}
	
	public void printList()
	{
		Node currNode = stack.head;
		while(currNode!=null)
		{
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
	}
	
	public static void main(String[] args)
	{
		stack.push(1);
		stack.printList();
		stack.push(2);
		stack.printList();
		stack.push(3);
		stack.printList();
		stack.pop();
		stack.printList();
		stack.pop();
		stack.printList();
		stack.pop();
		stack.printList();
		stack.pop();
		stack.printList();
	}
	
	
	
}

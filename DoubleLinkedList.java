package com.ds.practice;

public class DoubleLinkedList {

	Node head;
	static int count =-1;
	static DoubleLinkedList list = new DoubleLinkedList();
	
	static class Node
	{
		int data;
		Node previous;
		Node next;
		Node(int data)
		{
			this.data = data;
		}
	}
	
	public void insert(int data)
	{
		Node node = new Node(data);
		node.previous = null;
		node.next = null;
		
		if(list.head == null)
		{
			list.head = node;
			count++;
		}
		else
		{
			Node currNode = list.head;
			while(currNode.next!=null)
			{
				currNode = currNode.next;
			}
			currNode.next = node;
			node.previous = currNode;
			count++;
		}
	}
	
	public void insertAfter(int data, int previndex)
	{
		Node node = new Node(data);
		node.previous = null;
		node.next = null;
		
		if(list.head == null)
		{
			list.head = node;
			count++;
		}
		else
		{
			if(previndex>count)
			{
				System.out.println("Specified index is greater than the total number of elements in the list");
			}
			else
			{
				Node currNode = list.head;
				
				for(int  i = 0;i<previndex; i++)
				{
					currNode = currNode.next;
				}
				if(currNode.next!=null)
				node.next=currNode.next;
				
				currNode.next = node;
				node.previous = currNode;
				if(currNode.next.next!=null)
				{
					currNode.next.previous=node;
				}
				count++;
			}
		}
	}
	
	public void delete()
	{
		if(list.head == null)
		{
			System.out.println("No elements to delete");
		}
		else
		{
			Node currNode = list.head;
			Node prevNode = currNode;
			
			if(currNode.next==null)
			{
				list.head = null;
				count--;
			}
			else
			{
				while(currNode.next!=null)
				{
					prevNode = currNode;
					currNode = currNode.next;
				}
				
				prevNode.next = null;
				currNode.previous = null;
				count--;
			}
		}
	}
	
	public void deleteAt(int index)
	{
		if(index>count)
		{
			System.out.println("Specified index is greater than number of elements in the list");
		}
		else
		{
			Node currNode = list.head;
			for(int i = 0;i<index;i++)
			{
				currNode = currNode.next;
			}
			if(currNode.next!=null)
			{
				if(currNode.next.next!=null)
					{
						currNode.next=currNode.next.next;
						currNode.next.previous = currNode;
						count--;
					}
					else
					{
						currNode.next.previous = null;
						currNode.next = null;
						count--;
					}
			}
		}
	}
	
	public void printList()
	{
		Node currNode = list.head;
		while(currNode!=null)
		{
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
	}
	
	public static void main(String[] args) {
		
		list.insert(1);
		list.insert(2);
		list.insert(4);
		list.insert(5);
		list.insertAfter(3, 1);
		list.delete();
		list.deleteAt(0);
		list.deleteAt(2);
		list.delete();
		list.delete();
		list.printList();
		list.delete();
		list.printList();
		list.delete();
		list.printList();
	}

}

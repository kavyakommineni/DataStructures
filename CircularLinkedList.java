package com.ds.practice;

public class CircularLinkedList {
	
	Node head;
	
	static CircularLinkedList list = new CircularLinkedList();
	
	static int count=-1;
	
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
		}
	}
	
	public void insert(int data)
	{
		Node node = new Node(data);
		node.next = null;
		
		if(list.head == null)
		{
			list.head = node;
			list.head.next = list.head;
			count++;
		}
		else
		{
			Node currNode = list.head;
			
			while(currNode.next!=list.head)
			{
				currNode = currNode.next;
			}
			currNode.next = node;
			node.next = list.head;
			count++;
		}
	}
	
	public void insertAt(int data, int index)
	{
		Node node = new Node(data);
		node.next=null;
		
		if(list.head==null)
		{
			list.head = node;
			list.head.next = list.head;
			count++;
		}
		else
		{
			if(index>count)
			{
				System.out.println("Sepcified index is greater than count");
			}
			else
			{
				Node currNode = list.head;
				Node prevNode = currNode;
				
				for(int i = 0; i<index;i++)
				{
					prevNode = currNode;
					currNode = currNode.next;
				}
				
				prevNode.next = node;
				node.next = currNode;
				count++;
			}
		}
	}
	
	public void delete()
	{
		if(list.head==null)
		{
			System.out.println("No elements to delete");
		}
		else
		{
			Node currNode = list.head;
			Node prevNode = currNode;
			
			if(currNode.next==list.head)
			{
				list.head.next = null;
				list.head = null;
				count--;
			}
			else
			{
				while(currNode.next!=list.head)
				{
					prevNode = currNode;
					currNode = currNode.next;
				}
				prevNode.next=list.head;
				currNode.next = null;
				count--;
			}
		}
	}
	
	public void deleteAt(int index)
	{
		if(list.head==null)
		{
			System.out.println("No elements to delete");
		}
		else
		{
			Node currNode = list.head;
			Node prevNode = currNode;
			
			if(currNode.next==list.head)
			{
				list.head = null;
				list.head.next = null;
				count--;
			}
			else if(index == 0)
			{
				list.head = currNode.next;
				while(currNode.next!=prevNode)
				{
					currNode = currNode.next;
				}
				currNode.next = list.head;
				count--;
			}
			else
			{
				for(int i = 0;i<index;i++)
				{
					prevNode = currNode;
					currNode = currNode.next;
				}
				prevNode.next = currNode.next;
				currNode.next = null;
				count--;
			}
		}
	}

	public void printList()
	{
		Node currNode = list.head;
		if(list.head!=null)
		{
			while(currNode.next!=list.head)
			{
				System.out.println(currNode.data);
				currNode = currNode.next;
			}
			System.out.println(currNode.data);
		}
	}
	
	public static void main(String[] args) {
		
		list.insert(1);
		list.insert(2);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insertAt(3, 2);
		list.delete();
		list.deleteAt(0);
		list.deleteAt(2);
		list.printList();
		list.delete();
		list.delete();
		list.printList();
		list.delete();
		list.printList();
		list.delete();
		list.printList();
	}

}

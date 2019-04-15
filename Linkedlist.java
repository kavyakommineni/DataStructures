package com.ds.practice;

public class Linkedlist {
	
	Node head;
	static int count=0;
	
	static class Node
	{
		Node next;
		int data;
		Node(int data)
		{
			this.data = data;
		}
	}
	
	public void insert(int data,Linkedlist list)
	{
		Node node = new Node(data);
		node.next = null;
		
		if(list.head==null)
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
			currNode.next=node;
			count++;
		}
	}
	
	public void delete(int index,Linkedlist list)
	{
		if(list.head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			int i=0;
			Node currNode = list.head; 
			if(index>count-1)
			{
				System.out.println("Index is given is not in the list");
			}
			else if(index==0)
			{
				list.head = currNode.next;
			}
			else
			{
				while(i<index-1)
				{
					currNode = currNode.next;
					i++;
				}
				if(currNode.next!=null)
				{
					if(currNode.next.next!=null)
					currNode.next = currNode.next.next;
					else
						currNode.next=null;
				}
			}
		}
	}
	
	public void printList(Linkedlist list)
	{
		Node currNode = list.head;
		while(currNode!=null)
		{
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		
		Linkedlist list = new Linkedlist();
		list.insert(1, list);
		list.printList(list);
		list.insert(2, list);
		list.printList(list);
		list.insert(3, list);
		list.printList(list);
		list.insert(4, list);
		list.printList(list);
		list.insert(5, list);
		list.printList(list);
		list.insert(6, list);
		list.printList(list);
		list.delete(2, list);
		list.printList(list);
		list.delete(4, list);
		list.printList(list);
		list.delete(6, list);
		list.printList(list);
	}

}

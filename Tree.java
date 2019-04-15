package com.ds.practice;

public class Tree {

	Node root;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data = data;
		}
	}
	
	public void createTree(int data)
	{
		Node node = new Node(data);
		node.left = null;
		node.right = null;
		Node parentNode, currNode;
		
		if(root == null)
		{
			root = node;
		}
		else
		{
			currNode = root;
			while(true)
			{
				parentNode = currNode;
				
				if(data<currNode.data)
				{
					currNode = currNode.left;
					if(currNode == null)
					{
						parentNode.left=node;
						return;
					}
				}
				else if(data>currNode.data)
				{
					currNode = currNode.right;
					if(currNode == null)
					{
						parentNode.right = node;
						return;
					}
				}
			}
		}
	}
	
	public void preOrderTraversal(Node currNode)
	{
		if(currNode!=null)
		{
			System.out.println(currNode.data);
			preOrderTraversal(currNode.left);
			preOrderTraversal(currNode.right);
		}
	}
	
	public void postOrderTraversal(Node currNode)
	{
		if(currNode!=null)
		{
			postOrderTraversal(currNode.left);
			postOrderTraversal(currNode.right);
			System.out.println(currNode.data);
		}
	}
	
	public void inOrderTraversal(Node currNode)
	{
		if(currNode!=null)
		{
			inOrderTraversal(currNode.left);
			System.out.println(currNode.data);
			inOrderTraversal(currNode.right);
		}
	}
	
	
	public static void main(String[] args) {
		Tree t = new Tree();
		
		t.createTree(50);
		t.createTree(25);
		t.createTree(15);
		t.createTree(30);
		t.createTree(75);
		t.createTree(85);
		
		t.preOrderTraversal(t.root);
		System.out.println("post order");
		t.postOrderTraversal(t.root);
		System.out.println("in order");
		t.inOrderTraversal(t.root);
	}

}

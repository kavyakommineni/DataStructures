package com.ds.practice;

public class Stack {

	static Stack stack = new Stack();
	static int top;
	public static final int MAX=100;
	int[] array = new int[MAX];
	
	public Stack()
	{
		top=-1;
	}
	
	public void push(int data)
	{
		if(top==MAX)
		{
			System.out.println("Stack full");
		}
		else
		{
			top++;
			array[top]=data;
		}
	}
	
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			int x = array[top];
			top--;
			System.out.println(x + " is popped out");
		}
	}
	
	
	public static void main(String[] args) {
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.pop();
		stack.pop();
		stack.push(6);
	}

}

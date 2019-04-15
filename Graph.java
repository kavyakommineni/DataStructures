package com.ds.practice;

import java.util.LinkedList;

public class Graph {
	
	static int[][] edgeMatrix;
	static int count=0;
	static boolean[] visit;
	LinkedList<Integer> stack = new LinkedList<Integer>();
	
	static class Vertex
	{
		int data;
		Vertex(int data)
		{
			this.data = data;
		}
	}
	
	public void addVertex(int data)
	{
		new Vertex(data);
		count++;
	}
	
	public void addEdge(int x, int y)
	{
		edgeMatrix[x][y]=1;
		edgeMatrix[y][x]=1;
	}

	public void BFS(int data)
	{
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(data);
		visit = new boolean[count];
		visit[data] = true;
		while(queue.size()!=0)
		{
			for(int i = 0; i < count; i++)
			{
				if(edgeMatrix[data][i] == 1 && edgeMatrix[i][data] ==1 && !(visit[i]))
				{
					visit[i] = true;
					queue.add(i);
				}
			}
			
			int x = queue.poll();
			System.out.print(x + "\t");
			if(queue.size()!=0)
			{
				data = queue.peek();
			}
		}
		
	}
	
	public void DFS(int data)
	{
		if(!visit[data])
		{
			System.out.print(data + "\t");
			if(!stack.contains(data))
			{
				stack.add(data);
			}
			visit[data] = true;
		}
		boolean flag = false;
		
		if(stack.size()!=0)
		{
			for(int  i = 0; i<count; i++)
			{
				if(edgeMatrix[data][i]==1 && edgeMatrix[i][data]==1 && !visit[i])
				{
					if(!stack.contains(i))
					{
						stack.add(i);
					}
					flag = true;
					break;
				}
			}
		}
		if(!flag)
		{
			stack.pollLast();
		}
		if(stack.size()!=0)
		{
			data = stack.peekLast();
			DFS(data);
		}
	}
	
	public void printGraph()
	{
		for(int i = 0; i< count;i++)
		{
			for(int j = i; j < count;j++)
			{
				if(edgeMatrix[i][j] ==1 && edgeMatrix[j][i]==1)
				{
					System.out.println(i + " -> " + j);
				}
					
			}
		}
	}
	public static void main(String[] args) {
		
		Graph graph = new Graph();
		graph.addVertex(0);
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(4);
		graph.addVertex(5);
		graph.addVertex(6);
		edgeMatrix = new int[count][count];
		graph.addEdge(0, 1);
		graph.addEdge(0, 3);
		graph.addEdge(0, 4);
		graph.addEdge(1, 6);
		graph.addEdge(1, 5);
		graph.addEdge(1, 2);;
		graph.printGraph();
		
		graph.BFS(0);
		
		System.out.println("\n DFS is ");
		visit = new boolean[count];
		graph.DFS(0);
		

	}

}

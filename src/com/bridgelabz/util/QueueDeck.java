package com.bridgelabz.util;
public class QueueDeck
{
	private Node front, rear; 
	 // number of items 
	private int currentSize;

	private class Node//linked list
	{ 
		String data;
		Node next;
	} 
	public QueueDeck()//constructor
	{
		front = null;
		rear = null;
		currentSize = 0;
	}
	public boolean isEmpty()
	{
		return (currentSize == 0);
	}
	public void push(String data)
	{
		Node oldRear = rear;
		rear = new Node();
		rear.data = data;
		rear.next = null;
		if (isEmpty()) 
		{
			front = rear;
		}
		else 
		{
			oldRear.next = rear;
		}
		currentSize++;
		System.out.println(data);
	}

}


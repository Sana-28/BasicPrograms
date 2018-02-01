package com.bridgelabz.util;

import java.util.LinkedList;

public class GenericQueue<T> {

	public void enqueue(String name) {
		// TODO Auto-generated method stub
		LinkedList<T> list = new LinkedList<T>();
		 list.addLast((T) name);
	}
	public void enqueue(Integer accountNumber)
	{
		LinkedList<T> list = new LinkedList<T>();
		 list.addLast((T) accountNumber);
	}
}

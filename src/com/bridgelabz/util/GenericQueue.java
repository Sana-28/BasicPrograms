package com.bridgelabz.util;

import java.util.LinkedList;

public class GenericQueue<T> {
	
	//Initializing a linked list
	LinkedList<T> list = new LinkedList<T>();
	
	public void enqueue(String name) {
		// TODO Auto-generated method stub
		 list.addFirst((T) name);
	}
	
	public void enqueue(Integer number) {
		// TODO Auto-generated method stub
		 list.addFirst((T) number);
	}
	
	
}

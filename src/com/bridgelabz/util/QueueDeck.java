package com.bridgelabz.util;

public class QueueDeck {

	 QNode front;
	  
	public boolean add(Object e) {
		
		QNode temp = new QNode();
	      
        // If queue is empty, then new node is front and rear both
        if (front == null)
        {
           front = temp;
           return true;
        }
		return false;
 
	}
	
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}


}

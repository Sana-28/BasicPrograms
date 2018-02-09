package com.bridgelabz.objectOriented;
import java.util.LinkedList;

/**Purpose: This program is to add symbol to the stack
 * @author SANA SHAIKH
 * @since 15/01/2018
 * @param <T>
 */
public class StackCommercial<T>  {

	public LinkedList<T> stackCommercial;
	public int topOfArray;

	public void StackUsingLinkedList() {
		stackCommercial=new LinkedList<T>();
		topOfArray=-1;
	}

	public void push(T element) {
		topOfArray++;
		stackCommercial.add(topOfArray, element);
	}

	public void pop() {
		if(topOfArray==-1)
			System.out.println("Stack is empty");
		else {
			stackCommercial.removeLast();
			topOfArray--;
		}	
	}

	public boolean isEmpty() {
		return (topOfArray==-1);
	}
}


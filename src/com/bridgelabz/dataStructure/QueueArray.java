package com.bridgelabz.dataStructure;

public class QueueArray{
	//Queue array	
	private int Queue[];
	protected int front, rear, size, length;
	
	//Constructor of size n n-> given from main 
	public QueueArray(int n) {
	size = n;
	length = 0;
	Queue = new int[size];
	front = -1;
	rear = -1;
	}    

	public boolean isEmpty() 
	{
	return front == -1;
	}    

	public boolean isFull() 
	{
	return rear == size -1 ;
	}    
	
	public int getSize()
	{
	return Queue.length ;
	}  
	
	//print 1st element in array /queue
	public int peek(){
	if (isEmpty())
		 System.out.println("Underflow Exception");
	return Queue[front];
	}   
	
	//insert an integer to rear
	public void insert(int i) 	{
	if (rear == -1) 
	{
	    front = 0;
	    rear = 0;
	    Queue[rear] = i;
	}
	else if (rear + 1 >= size)
	    System.out.println("Overflow Exception");
	else if ( rear + 1 < size)
	    Queue[++rear] = i;    
	length++ ;    
	}  
	
	//insert a string to rear
	public void insert(char i) 	{
	if (rear == -1) 
	{
	    front = 0;
	    rear = 0;
	    Queue[rear] = i;
	}
	else if (rear + 1 >= size)
		 System.out.println("Overflow Exception");
	else if ( rear + 1 < size)
	    Queue[++rear] = i;    
	length++ ;    
	}    

	public int remove() {
	if (isEmpty())
		 System.out.println("Underflow Exception");
	else 
	{
	    length-- ;
	    //int element = Queue[front];
	    if ( front == rear) 
	    {
	        front = -1;
	        rear = -1;
	    }
	    else
	        front++;                
	    }  
	return front;
	}

	public void display()	{
	System.out.print("\nQueue => ");
	if (length == 0)
	{
	    System.out.print("Empty Queue\n");
	    return ;
	}
	for (int i = front; i <= rear; i++)
	    System.out.print(Queue[i]+" ");
	System.out.println();        
	}
}   
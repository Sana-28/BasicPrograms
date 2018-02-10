package com.bridgelabz.util;

public class LinkedList {
	LNode start;
	LNode end;
	int size;
	
	//Constructor
	public LinkedList()
	{
		start=null;
		end=null;
		size=0;
	}
	
	//Check list
	public boolean isEmpty()
	{
		return start==null;
	}
	
	//get the size of list
	public int getSize()
	{
		return size;
	}

	public void add(int value)
	{
		LNode pointer=new LNode(value,null);
		size++;
		if(start==null)
		{
		   start=pointer;
		   end=start;
		}
		else
		{
			pointer.setLink(start);
			start=pointer;
		}
	}
	
	public void remove(int position)
	{
		   
	        if (position == 1) 
	        {
	            start = start.getLink();
	            size--; 
	            return ;
	        }
	        if (position == size) 
	        {
	        	LNode start1 = start;
	        	LNode temp = start;
	            while (start1 != end)
	            {
	            	temp = start1;
	                start1 = start1.getLink();
	            }
	            end = temp;
	            end.setLink(null);
	            size --;
	            return;
	        }
	        LNode pointer = start;
	        position = position - 1 ;
	        for (int i = 1; i < size - 1; i++) 
	        {
	            if (i == position) 
	            {
	            	LNode temp1 = pointer.getLink();
	            	temp1 = temp1.getLink();
	                pointer.setLink(temp1);
	                break;
	            }
	            pointer = pointer.getLink();
	        }
	        size-- ;
	    }    	
	}

package com.bridgelabz.dataStructure;

import java.util.*;

import com.bridgelabz.util.Utility;
 
/**Purpose: This program implements stack using stack
 * @author Sana Shaikh
 *
 */
/*  Class Node  */
class Node
{
    protected int data;
    protected Node link;
 
    /*  Constructor  */
    public Node()
    {
        link = null;
        data = 0;
    }    
    /*  Constructor  */
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    }    
    /*  Function to set link to next Node  */
    public void setLink(Node n)
    {
        link = n;
    }    
    /*  Function to set data to current Node  */
    public void setData(int d)
    {
        data = d;
    }    
    /*  Function to get link to next node  */
    public Node getLink()
    {
        return link;
    }    
    /*  Function to get data from current Node  */
    public int getData()
    {
        return data;
    }
}
 
/*  Class linkedStack  */
class linkedStack
{
    protected Node top ;
    protected int size ;
 
    /*  Constructor  */
    public linkedStack()
    {
        top = null;
        size = 0;
    }    
    /*  Function to check if stack is empty */
    public boolean isEmpty()
    {
        return top == null;
    }    
    /*  Function to get the size of the stack */
    public int getSize()
    {
        return size;
    }    
    /*  Function to push an element to the stack */
    public void push(int data)
    {
        Node nptr = new Node (data, null);
        if (top == null)
            top = nptr;
        else
        {
            nptr.setLink(top);
            top = nptr;
        }
        size++ ;
    }    
    /*  Function to pop an element from the stack */
    public int pop()
    {
    	//checks for empty
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception") ;
        Node ptr = top;
        top = ptr.getLink();
        size-- ;
        return ptr.getData();
    }    
    /*  Function to check the top element of the stack */
    public int peek()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception") ;
        return top.getData();
    }    
    /*  Function to display the status of the stack */
    public void display()
    {
        System.out.print("\nStack : ");
        if (size == 0) 
        {
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = top;
        while (ptr != null)
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.println();        
    }
}
 
/* Class LinkedStackImplement */
public class LinkedStackImplement
{    
    public static void main(String[] args)
    {
        /* Creating object of class linkedStack */   
        linkedStack linkedList = new linkedStack();          
      
        char ch;     
        do 
        {
        	  /* Perform Stack Operations */  
            System.out.println("Linked Stack Operations\n");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");            
            int choice1 = Utility.getInteger();
            switch (choice1) 
            {
            case 1 :
                System.out.println("Enter integer element to push");
                linkedList.push( Utility.getInteger() ); 
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Popped Element = "+ linkedList.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    System.out.println("Peek Element = "+ linkedList.peek());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = "+ linkedList.isEmpty());
                break;                
            case 5 : 
                System.out.println("Size = "+ linkedList.getSize()); 
                break;                
            case 6 : 
                System.out.println("Stack = "); 
                linkedList.display();
                break;                        
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }           
            /* display stack */    
            linkedList.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = Utility.getString().charAt(0);       
 
        } while (ch == 'Y'|| ch == 'y');                 
    }
}


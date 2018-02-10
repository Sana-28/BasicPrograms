package com.bridgelabz.util;

/**Purpose: This Program is to create a Node of Linked list.
 * @author SaNA SHAIKh
 * @since 15/01/2018
 */
public class LNode {
	int data;
	LNode link;
	
	//Constructor
	public LNode()
	{
		data=0;
		link=null;
	}
	
	//Constructor
	public LNode(int d,LNode n)
	{
		data=d;
		link=n;
	}
	
	//Method to set link
	public void setLink(LNode n)
	{
		link=n;
	}
	
	//Method to get a link
	public LNode getLink()
	{
		return link;
	}
	
	//Method to set data
	public void setData(int d)
	{
		data=d;
	}
	
	//Method to get data
	public int getData()
	{
		return data;
	}
}

//JAVA PROGRAM FOR DEMO OF LIST

import java.util.*;
import java.io.*;

class Listdemo
{
	Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		Arraydemo obj1=new Arraydemo();
		Linkedlistdemo obj2=new Linkedlistdemo();
	}

}


class Arraydemo extends Listdemo
{
	public Arraydemo() 
	{
		
		int n;
		String in;
		List<String> al=new ArrayList<String>();
		
		System.out.println("ENTER THE NO INPUTS");
		n=sc.nextInt();
		System.out.println("ENTER THE INPUTS");

		while(n>0)
		{
			in=sc.next();
			al.add(in);
			n--;
		}
	
		System.out.println(al);
		
	}

}

class Linkedlistdemo extends Listdemo
{
	public Linkedlistdemo()
	{
		int n;
		String in;
		
		List<String> l=new LinkedList<String>();
		
		System.out.println("ENTER THE NO OF INPUTS");
		n=sc.nextInt();

		System.out.println("ENTER THE INPUTS");
		
		//ITERATOR 
		
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())		
		{
			System.out.println(itr.next());
		}
	}
}
//MAP DEMO WITH GENERICS S
import java.io.*;
import java.lang.*;
import java.*;
import java.util.*;


class Mapdemo
{
	Scanner sc =new Scanner(System.in);
	public static void main(String args[])
	{
		Hashmapdemo obj1=new Hashmapdemo();
		Hashtabledemo obj2=new Hashtabledemo();
	}
}


class Hashmapdemo extends Mapdemo
{
	public Hashmapdemo()
	{
		int n,no;
		String in;
		
		Map<Integer,String> hp=new HashMap<Integer,String>();
		
		System.out.println("ENTER THE NO OF INPUTS");
		n=sc.nextInt();
		
		System.out.println("ENTER THE INPUTS");
		while(n>0)
		{
			in=sc.next();
			no=sc.nextInt();
			hp.put(no,in);
			n--;
		}

		//USING ENHANCED FOR LOOP
		for(Map.Entry m:hp.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
	}

}

class Hashtabledemo extends Mapdemo
{
	public Hashtabledemo()
	{
		int no,n;
		String in;
		Map<Integer,String> ht=new Hashtable<Integer,String>();
		
		System.out.println("ENTER THE NO OF INPUTS");
		n=sc.nextInt();

		System.out.println("ENTER THE INPUTS");
		while(n>0)
		{
			in=sc.next();
			no=sc.nextInt();
			ht.put(no,in);
			n--;
		}

		System.out.println(ht);
	}
}
import java.io.*;
import java.util.*;


class Setdemo
{
	Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		Hashsetdemo obj1=new Hashsetdemo();
		Treesetdemo obj2=new Treesetdemo();
		Linkedhashset obj3=new Linkedhashset();

	}
}


class Hashsetdemo extends Setdemo
{
	public Hashsetdemo()
	{
		Set<String> hs=new HashSet<String>();
		int n;
		String in;
	
		System.out.println("ENTER THE NO OF INPUTS");
		n=sc.nextInt();

		System.out.println("ENTER THE INPUTS");
		while(n>0)
		{
			in=sc.next();
			hs.add(in);
			n--;
		}
		
		//ADVANCE FOR LOOP
		System.out.println();
		for(String i:hs)
		{
			System.out.println(i);
		}
	}
}

class Treesetdemo extends Setdemo
{
	public Treesetdemo()
	{
		Set<String> ts=new TreeSet<String>();
		int n;
		String in;

		System.out.println("ENTER THE NO OF INPUTS");
		n=sc.nextInt();

		System.out.println("ENTER THE INPUTS");
		while(n>0)
		{
			in=sc.next();
			ts.add(in);
			n--;
		}

		System.out.println(ts);
	}
}

class Linkedhashset extends Setdemo
{
	public Linkedhashset()
	{
		Set<String> lhs=new LinkedHashSet<String>();
		int n;
		String in;

		System.out.println("ENTER THE NO OF INPUTS");
		n=sc.nextInt();

		System.out.println("ENTER THE INPUTS");
		while(n>0)
		{
			in=sc.next();
			lhs.add(in)		;
			n--;
		}

		System.out.println(lhs);
	}
}
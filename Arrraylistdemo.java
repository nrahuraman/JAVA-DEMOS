import java.util.*;

class Arrraylistdemo
{
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		
		al.add(new Integer (123));
		al.add(new Integer(234));
		al.add(65);
		al.add("welcome");
		al.add(32.5);
		
		System.out.println("this is array list"+al);
	}
}
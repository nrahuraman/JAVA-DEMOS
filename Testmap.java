import java.util.*;
class Testmap
{
public static void main(String args[])
	{
		Map m1=new  HashMap();
		m1.put(1,"ajay");
		m1.put(2,"vijay");
	Set s1=m1.keySet();
	System.out.println(s1);
		Collection s2=m1.values();
		System.out.println(s2);
		Set s3=m1.entrySet();
		System.out.println(s3);
		System.out.println(m1.get(1));
	}
}
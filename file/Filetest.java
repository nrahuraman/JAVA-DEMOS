import java.io.*;
import java.util.*;

class Filetest
{

	public static void file()
	{
		String nam;
		Scanner sc=new Scanner(System.in);
		nam=sc.next();
		
		try
		{
			FileInputStream fn=new FileInputStream(nam);
			
			int i=0;
			while((i=fn.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			FileOutputStream fn1=new FileOutputStream(nam);
				int j=0;
				while((i=fn.read())!=-1)
				{
				System.out.println("EDITING THE FILE");	
				String s=sc.next();	
				byte b[]=s.getBytes();
				fn1.write(b);
				fn1.close();
				System.out.println("FILE WRITING IS SUCCESFULL");fn.close();
}
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		file();
	}
}

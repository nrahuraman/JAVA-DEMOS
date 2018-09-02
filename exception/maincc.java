class Expcc extends Exception
{
	public Expcc(String s)
	{
		super(s);
	}
}

class Testcc
{
	void check(int a,int b)throws Expcc
	{
		if(a>b)
			System.out.println(a);
		else
			throw new Expcc("YOU HAVE MADE AN ERROR");

	}
}

class maincc
{
	public static void main(String args[])
	{
		try
		{
		Testcc obj=new Testcc();
		obj.check(10,25);
		}
		catch(Expcc e)
		{
			e.printStackTrace();
		}
	}
}
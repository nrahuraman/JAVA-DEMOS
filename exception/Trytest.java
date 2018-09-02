class Trytest extends Exception
{
	public Trytest(String s)
	{
		super(s);
	}
	public static void main(String args[])
	{
		try
		{
			throw new Trytest("error has occured")		;

		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
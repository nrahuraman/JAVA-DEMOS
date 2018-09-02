//JAVA PROGRAM TO DEMONSTRATE ENUM CLASS


enum Cars
{
	BMW,AUDI,BENZ,ROLLSROYCE,MCLAREN,LAMBORGINI,PORCHE;


	public  static void main(String args[])
	{
		Cars arr[]=Cars.values();

		//USING ENHANCED FOR LOOP

		for(Cars cr:arr)
		{
			System.out.println(cr+"at place"+cr.ordinal());
		}
	}
}
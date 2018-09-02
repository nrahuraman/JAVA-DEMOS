interface Object
{
	
	public float area();
	public float volume();
	
}

class Getvalue implements Object
{
	float d1,d2,d3;
	public Getvalue(float a,float b,float c)
	{
		this.d1=a;
		this.d2=b;
		this.d3=c;
	}
	
	public float area()
	{
		float ar;
		ar=d1*d2;
		return ar;
	}
	public float volume()
	{
		float vol;
		vol=d1*d2*d3;
		return vol;
	}
}

class Interfacedemo
{
	public static void main(String args[])
	{
		float vol,ar;
		Getvalue obj=new Getvalue(12,10,35);
		ar=obj.area();
		vol=obj.volume();
		
		System.out.println("area="+ar+"volume"+vol);
	}
}
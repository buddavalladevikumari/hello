class base
{
	public void show()
	{
		System.out.println("show base");
	}
}
class derrived extends base
{
	public void show()
	{
		super.show();
		System.out.println("show derrived");
	}
}
class single
{
	public static void main(String args[])
	{
		derrived d = new derrived();
		d.show();
	}
}
	

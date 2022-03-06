package phase2;

public class p 
{
	public void m9()
	{
	    System.out.println("in method m9 of phase1");
	    m10();
    }
	private void m10()
	{
		System.out.println("in method 10 of phase1");
	}
	void m11()
	{
		System.out.println("in method 11 of phase1");
	}
	protected void m12()
	{
		System.out.println("in method m12 of phase1");
	}
	public static void main(String[] args)
	{
		m m1=new m();
		n m2=new n();
		System.out.println("value is :"+m1.n3);
		System.out.println("value is :"+m2.n5);
		System.out.println("value is :"+m2.n6);
		System.out.println("value is :"+m2.n7);
	

	}

}

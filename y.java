package phase3;

import phase2.m;
import phase2.n;
public class y extends n
{
	public static void main(String[] args)
	{  
		//calling all variables of class x except the private variable
		x t1=new x();
		System.out.println("the value is :"+t1.n5);
		System.out.println("the value is :"+t1.n6);
		System.out.println("the value is :"+t1.n7);
		
		
		//calling all methods frpm class n except method m7
		n t2=new n();
		t2.m5();
		n t3=new y();
		y t4=new y();
		t4.m8();
		
		System.out.println("");
		m s1=new m();
		s1.m1();
		
	}

}

package phase3;
import phase2.p;
import phase2.n;
import phase2.m;
public class z extends m
{
	public static void main(String[] args)
	{
		//calling all methods from class m except method m3
		//calling all methods from class n except method m7 and method m8
		//calling all methods from class p except the method m11 and method m12
		m m5=new m();
		m5.m1();
		n m6=new n();
		m6.m5();
		x m7=new x();
		System.out.println("");
		z m10=new z();
		m10.m1();
		m10.m4();
		System.out.println("");
		
		p p1=new p();
		p1.m9();
		
		////calling all variables from class x except n4 as it is private variable
		
		System.out.println(" the value is :"+m7.n5);
		System.out.println(" the value is :"+m7.n6);
		System.out.println(" the value is :"+m7.n7);
	}
}

package p4;

public class overloading
{
	public static void main(String[] args)
	{
		overloading ob1=new overloading();
		int x1=ob1.add(4, 5);
		double x2=ob1.areaCircle(4);
		int x3=ob1.areaRectangle(5, 2);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		
		
	}
	int add(int a, int b)
	{
		return a+b;
	}
	double areaCircle(int radius)
	{
		return 3.14*radius*radius;
	}
	int areaRectangle(int l,int b)
	{
		return l*b;
		
		
	}

}

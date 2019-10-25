package com.normal.inner;

public class NormalInner 
{
	int x=20;
	static int y=30;
	class InnerB
	{
		int x=200;

		String innerMethod()
		{
			int x=2000;

			System.out.println("value from inner class inner local method="+x);
			System.out.println("value from inner class variable="+this.x);
			System.out.println("value from outer class variable="+NormalInner.this.x);
			System.out.println("value of x="+x);
			System.out.println("value of y="+y);
			System.out.println("iam Inner class");
			return new InnerB().toString();
		}

	}
	public	String outerMethod() 
	{
		InnerB b=new InnerB();
		b.innerMethod();
		return "hello";

	}
	public static void main(String[] args) 
	{
		System.out.println("iam from outer classs");
		NormalInner ni=new NormalInner();
		System.out.println("value from outer class x="+ni.x);
		System.out.println("value from outer class y="+ni.y);
		ni.outerMethod();

		//NormalInner n=new NormalInner();
		//InnerB innerB = n.new InnerB();
		//innerB.innerMethod();
		//NormalInner.InnerB b=new NormalInner().new InnerB();
		//new NormalInner().new InnerB().innerMethod();
	}
}


package com.normal.inner.method;

public class MethodInner 
{
int x=20;
static int y=30;
public void methodOne() 
{
	class InnerOne
	{
		public void methodTwo() 
		{
			System.out.println("value of x="+x);
			System.out.println("value of y="+y);
		}
	}
	InnerOne one=new InnerOne();
	one.methodTwo();
	}
public static void main(String[] args) {
	MethodInner mi=new MethodInner();
	mi.methodOne();
}
}

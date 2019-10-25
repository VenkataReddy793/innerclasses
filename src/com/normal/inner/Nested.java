package com.normal.inner;
class A
{
	boolean m1()
	{
		System.out.println("iam from A(),m1() class");
		return false;
	}
	class B
	{
		boolean m2() 
		{
			System.out.print(m1());
			System.out.println("iam from B(),M2()");
			return false;
		}
		class C
		{
			void m3() 
			{
				System.out.println("iam from C(),m3");
				System.out.println(m2());
			}
		}
	}
}
public class Nested {

	public static void main(String[] args) {
		A a=new A();
		A.B b = a.new B();
		A.B.C c = a.new B().new C();
		a.m1();
		b.m2();
		
		c.m3();

	}

}

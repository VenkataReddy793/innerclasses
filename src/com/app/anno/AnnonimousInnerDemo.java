package com.app.anno;
class PopCorn
{
	public void taste()
	{
		System.out.println("spicy");
	}
}
public class AnnonimousInnerDemo 
{


	public static void main(String[] args) 
	{
		PopCorn p=new PopCorn()
		{
			public void taste() {
				System.out.println("salty");

			}
		};
		p.taste();
		PopCorn p1=new PopCorn();
		p1.taste();
	}

}

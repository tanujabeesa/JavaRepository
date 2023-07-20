package mypack;

public class StringExample 
{
	public String greet(String name)
	{
		return "Good Morning !"+ name;
	}
	
	public static void main(String[] args)
	{
		StringExample obj = new StringExample();
		System.out.println(obj.greet("     William       James    "));
		System.out.println(obj.greet("Jack"));
		System.out.println(obj.greet("Mohan"));
		System.out.println(obj.greet("   Pooja   "));
		
	}

}



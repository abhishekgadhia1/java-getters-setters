public class Demo
{
	public static void main(String[] args)
	{
		Person p = new Person();
		p.setName("Abhishek");
		System.out.println(p.getName());
	}
}

class Person
{
	private String name;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String names)
	{
		this.name = names;
	}
}

public class SingletonDemo 
{
	static SingletonDemo obj = new SingletonDemo();
	private SingletonDemo()
	{}
	public static SingletonDemo getInstance()
	{
		return obj;
	}
	void display()
	{
		System.out.println("This is an example for singleton design pattern.singleton design pattern allows only to create one object for a class");
	}
}

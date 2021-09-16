package character.value;

public class Object {
	int wheels = 4;
	
	static int enginee = 1;
	void getrun()
	{
		System.out.print("running");
	}
	static void getSpeed()
	{
		System.out.println("speed");
	}

	public static void main(String[] args) 
	{
		Object c1 = new Object();
		Object c2 = new Object();
		c1.wheels = 6;
		c1.enginee = 2;
		c1.getrun();
		

	}

}

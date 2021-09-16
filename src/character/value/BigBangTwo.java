package character.value;

public class BigBangTwo {
	public static void main(String[]args)
	{
		for(int i = 1;i<=10;i++)
		{
			if(i%3 ==0)
			{
				System.out.println("Big");
			}
			else if(i%5 == 0)
			{
				System.out.println("Bang");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}

package character.value;

public class Practice 
{
	public static void main(String[] args) 
	{
		
		for(int a = 1;a<=5;a++)
		{	
			if(a == 1||a==5)
			{
				for(int b = 1;b<=3;b++)
				{
					if(b%3==0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}else if(a == 2||a == 4)
			{
				for(int c = 1;c<=5;c++)
				{
					if(c%2==0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}else if(a==3)
			{
				for(int d = 1;d<=5;d++)
				{
					if(d==1||d==5)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}	
		

	}
}


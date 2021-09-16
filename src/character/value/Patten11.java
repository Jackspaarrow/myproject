package character.value;

public class Patten11 
{
	public static void main(String[] args) 
	{
		for(int a = 1;a<=4;a++)
		{
			if((a==1)||(a==4))
			{
				for(int b = 1 ;b<=4;b++)
				{
					System.out.print(b);
				}
				
			}
			else if((a==2)||(a==3))
				{
					for(int c=2;c>1;c--)
					{
						System.out.print(c);
					}
					for(int d=1;d<=2;d++)
					{
						System.out.print(" ");
					}
					for(int e=3;e>2;e--)
					{
						System.out.print(e);
					}
						
				}
			System.out.println();
			}
		

	}

}

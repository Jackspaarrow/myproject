package character.value;

public class Pattern8 
{
	public static void main(String[] args) 
	{
		for(int a = 1;a<=3;a++)
		{
			if((a==1)||(a==3))
			{
				for(int b=2;b>0;b--)
				{
					System.out.print(" ");
				}
				for(int c=1;c>0;c--)
				{
					System.out.print("*");
				}
				for(int d=2;d>0;d--)
				{
					System.out.print(" ");
				}
			}else 
				{
					for(int e=5;e>0;e--)
					{
						if(e%2!=0)
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
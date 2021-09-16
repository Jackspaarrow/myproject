package character.value;

public class Patten13 {

	public static void main(String[] args) {
		for(int a = 1;a<=4;a++)
		{
			if(a==1)
			{
				for(int b = 1;b<=3;b++)
				{
					if(b==3)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				
			}else if(a==2)
			{
				for(int c = 1;c<=4;c++)
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
				for(int d = 1;d<=4;d++)
				{
					if((d==1)||(d==4))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}else if(a==4)
			{
				for(int e=1;e<=3;e++)
				{
					if((e==2)||(e==3))
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

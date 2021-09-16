package character.value;

public class Patten5 {

	public static void main(String[] args) {
		for(int i = 1;i<=4;i++)
		{
			if((i==1)||(i==4))
			{
				for(int j = 1;j<=4;j++)
				{
					System.out.print("*");
				}
			}else	if((i==2)||(i==3))
				{
					for(int k=1;k>0;k--)
					{
						System.out.print("*");
					}
					for(int a = 2;a>0;a--)
					{
						System.out.print(" ");
					}
					for(int b = 1;b>0;b--)
					{
						System.out.print("*");
					}
				}
			System.out.println();
		}
	}

}



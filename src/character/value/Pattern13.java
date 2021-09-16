package character.value;

public class Pattern13 {

	public static void main(String[] args) {
		int n = 5;
		for(int a = 1;a<=n;a++)
		{
			if((a==1)||(a==n))
			{
				for(int b = 1 ;b>0;b--)
				{
					System.out.print(" ");
				}
				for(int c=2;c>0;c--)
				{
					System.out.print("*");
				}
			}
			else if(a==2)
			{
				for(int d = 1; d>0;d--)
				{
					System.out.print("*");
				}
				for(int e = 2;e>0;e--)
				{
					System.out.print(" ");
				}
				for(int f = 1;f>0;f-- )
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		

	}

}

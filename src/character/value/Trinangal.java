package character.value;

public class Trinangal 
{
	public static void main(String[] args) 
	{	
		int n = 5;
		int b = 1;
		int d = 2;
		
		for(int i = 1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			int q = 1;
			for(int k = i; k>0;k--)
			{
				System.out.print(b);
				b = b + q;
			}
			q--;
			for(int c = i;c>1;c--)
			{
				System.out.print(d);
				d++;
			}
		System.out.println();
			//b++;
		}

	}

}

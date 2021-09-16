package character.value;

public class Pattern4 {

	public static void main(String[] args) {
		for(int i = 1;i<=4;i++)
		{
			for(int j=i;j<4;j++)
			{
				System.out.print(" ");
			}
			for(int k = i;k>0;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

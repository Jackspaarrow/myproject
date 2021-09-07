package character.value;

public class ForNest2 {

	public static void main(String[] args) {
		for(int i = 4;i>0;i--)
		{
			for(int j = 3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k = i ;k>0;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

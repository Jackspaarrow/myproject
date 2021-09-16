package character.value;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 0;
		while(i<5)
		{
			int j = 0;
			while(j<5)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}

}

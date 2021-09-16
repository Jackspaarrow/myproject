package character.value;

public class Break {

	public static void main(String[] args) {
		for(int a = 1;a<=4;a++)
		{
			for(int b = 1;b<=4;b++)
			{
				System.out.print(b);
				if(a == b)
				{
					System.out.print("*");
					break;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

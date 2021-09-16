package character.value;

public class PatternEx {

	public static void main(String[] args) {
		for(int a = 1;a<=3;a++)
		{
			if(a==1||a==3)
			{
				for(int b = 1;b<=3;b++)
				{
					if(b==1)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
				}
			}else
			{
				for(int c = 1;c<=4;c++)
				{
					if(c==1||c==4)
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

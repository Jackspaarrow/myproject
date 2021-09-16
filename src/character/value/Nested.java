package character.value;

public class Nested {

	public static void main(String[] args) {
		int a = 6, b = 6 ,c = 6;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a);
				
			}else if(c>a)
			{
				System.out.println(c);
			}
			else
			{
				System.out.println("c and a");
			}
		}else if(b>a)
		{
			if(b>c)
			{
				System.out.println(b);
			}else if(c>b)
			{
				System.out.println(c);
			}
			else
			{
				System.out.println("b and c");
			}
			
		}else if((a>c)&&(b>c))
		{
			System.out.println(" a and b ");
		}
		else if((c>a)&&(c>b))
		{
			System.out.println(c);
		}
		else
		{
			System.out.println("abc");
		}

	}

}

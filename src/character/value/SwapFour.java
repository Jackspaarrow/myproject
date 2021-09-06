package character.value;

public class SwapFour {

	public static void main(String[] args) {
		int a = 1,b = 2,c = 3,d;
		if((a<b)&&(b>c)&&(c>a))
		{
			d = b;
			b = c;
			c = d;
			
		}
		if((a<b)&&(b>c)&&(c<a))
		{
			d = c;
			c = b;
			b = a;
			a = d;
			
		}
		if((a>b)&&(b<c)&&(c>a))
		{
			d = b;
			b = a;
			a = d;
		}
		if((a>b)&&(b>c)&&(c<a))
		{
			d = c;
			c = a;
			a = d;
		}
		if((a>b)&&(b<c)&&(c<a))
		{
			d = a;
			a = b;
			b = c;
			c = d;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	

	}

}

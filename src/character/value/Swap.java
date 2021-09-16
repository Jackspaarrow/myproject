package character.value;

public class Swap {

	public static void main(String[] args) {
		int a = 2 , b = 3, c = 1,d;
		if((a<b)&&(b<c))
		{
			a = a;
			b = b;
			c = c;
		}else if((a>b)&&(b>c))
				{
					d = c;
					c = a;
					a = d;
					b = b;
					
				}else if((a<b)&&(b>c))
				{
					d = b;
					b = c;
					c = d;
					a = a;
					
					
			}else if((a<b)&&(b>c))
				{
					d = c;
					c = b;
					b = a;
					a = d;
				
				}else if((a>b)&&(b<c))
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

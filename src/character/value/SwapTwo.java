package character.value;

public class SwapTwo {

	public static void main(String[] args) {
		int a = 2,b = 1,c = 3 ,d;
		if((a<b)&&(b>c))
		{
			d = b; //d= 3;
			b = c; //b = 1;
			c = d; //c = 3
					//a =2	
			if((a<b)&&(b<c))
			{
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
			else
			{
					d = b; // d = 2
					b = a;	//a = 1
					a = d;  //b = 2
				
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
			}
		}else if((a>b)&&(b<c))
		{
			d = b;
			b = a;
			a = d;
		
			if((a<b)&&(b<c))
			{
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
			else
			{
				d = b;
				b = c;
				c = d;
			
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
			
		}else if((a>b)&&(b>c))
		{
			d = a;
			a = c;
			c = d;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		else
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
		}

	}

}

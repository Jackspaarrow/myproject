package character.value;

public class Ascending {

	public static void main(String[] args) {
		int a = 2,b = 3,c = 1,d;
		if(a>b)
		{
		 d = a;
		 a = b; //a = 3
		 b = d; //b = 5
		}
		if(a>c)
		{		
			d=a;
			a=c;
			c=d;
			
		}
		if(b>c)
		{
			d = b;
			b = c;
			c = d;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}

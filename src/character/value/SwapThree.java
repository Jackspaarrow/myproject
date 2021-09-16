package character.value;

public class SwapThree 
{

	public static void main(String[] args) 
	{
	     int a=1,b=3,c=2,d;
	        if(a>b && a>c)
	        {
	            d=a;
	            if(b>c)
	            {
	                a=c;
	                c=d;
	            }
	            else
	            {
	                a=b;
	                b=c;
	                c=d;
	            }
	        }
	        else if(a>b && a<c)
	        {
	            d=a;
	            a=b;
	            b=d;
	        }
	        else if(a<b &&a<c)
	        {
	            if(b>c)
	            {
	                d=b;
	                b=c;
	                c=d;
	            }
	        }
	        else if(a<b &&a>c)
	        {
	            d=c;
	            c=b;
	            b=a;
	            a=d;
	        }
	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
	    

	}

}

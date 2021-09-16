package character.value;

public class Atm 
{

	public static void main(String[] args) 
	
	{
		int cash = 4800, f ,t , h , r;
		if((cash%500==0)||(cash%200==0)||(cash%100==0))
		{
			f = cash /500;
			r = cash%500;
			cash = r;
			t = cash/200;
			r = cash%200;
			cash = r;
			h = cash/100;
			System.out.println("500 note is " + f);
			System.out.println("200 note is " + t);
			System.out.println("100 note is " + h);
		}
		else
		{
			System.out.println("invaild value");
		}
		
		

	}

}

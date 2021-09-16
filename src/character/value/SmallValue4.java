package character.value;

public class SmallValue4 {

	public static void main(String[] args) {
		int a = 10,b = 10,c = 10,d = 11;
		if((a<b)&&(a<c)&&(a<d))
		{
			System.out.print("A is SmallNumber");
		}
		else if((b<a)&&(b<c)&&(b<d))
		{
			System.out.println("B is SamllNumber");
			
		}
		else if((c<a)&&(c<b)&&(c<d))
		{
			System.out.println("C is SmallNumber");
		
		}
		else if((d<a)&&(d<b)&&(d<c))
		{
			System.out.println("D is SmallNumber");
		}
		else
		{
			System.out.println("Three number are same");
		}

	}

}

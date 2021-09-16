package character.value;

public class SmallValue {

	public static void main(String[] args) {
		int a = 14,b = 10 ,c = 11;
		if(a<b && a<c)
		{
			System.out.println("A is smallNumber");
			
		}else if(b<a && b<c)
		{
			System.out.println("B is SmallNumber");
			
		}else if(c<a && c<b)
		{
			System.out.println("C is SmallNumber");
		}
		else		
		{
			System.out.println("three Number is same value");
		}


	}

}

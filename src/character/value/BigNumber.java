package character.value;

public class BigNumber {

	public static void main(String[] args) {
		int a = 14,b = 17 ,c = 11;
		if(a>b && a>c)
		{
			System.out.println("A is bigNumber");
			
		}else if(b>a && b>c)
		{
			System.out.println("B is BigNumber");
			
		}else if(c>a && c>b)
		{
			System.out.println("C is BigNumber");
		}
		else		
		{
			System.out.println("three Number is same value");
		}

	}

}

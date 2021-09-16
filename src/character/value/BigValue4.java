package character.value;

public class BigValue4 {

	public static void main(String[] args) {
	int a = 100,b = 30,c = 29,d = 28;
	if((a>b)&&(a>c)&&(a>d))
	{
		System.out.print("A is BigNumber");
	}
	else if((b>a)&&(b>c)&&(b>d))
	{
		System.out.println("B is BigNumber");
		
	}
	else if((c>a)&&(c>b)&&(c>d))
	{
		System.out.println("C is BigNumber");
	
	}
	else if((d>a)&&(d>b)&&(d>c))
	{
		System.out.println("D is BigNumber");
	}
	else
	{
		System.out.println("Three numver are same");
	}
  }


}

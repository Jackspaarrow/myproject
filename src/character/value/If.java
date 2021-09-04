package character.value;

public class If{

	public static void main(String[] args) {
		int  a = 16, b = 17 ,c = 16;
		if((a==b)&&(b==c))
		{
			System.out.println("A and b and c are equal");
		}
		else if((a<b)&&(a<c))
		{
			System.out.println("A is Smaller");
		}
		else if((b<a)&&(b<c))
		{
			System.out.println("B is Smaller");
		}
		else if((c<a)&&(c<b))
		{
			System.out.println("c is Smaller");
		}else if((a<c)&&(b<c)) //(a==b)&&(b<c)
		{
			System.out.println("a and b are smaller");
		}else if((b<a)&&(c<a)) //(b==c)&&(c<a)
		{
			System.out.println("b and c are smaller");
			
		}else if((c<b)&&(a<b)) //(c==b)&&(c<b)
		{
			System.out.println("c and a smaller");
		}
	}
}

		

	

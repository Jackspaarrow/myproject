package character.value;

public class SingalDigit2 {

	public static void main(String[] args) {
		int a = 5666,sum = 0;
		for(;a>0;)
		{
			sum = sum + (a%10);
			a = a/10;
		}
		System.out.println(a);
		int r , q ,res;
		a = sum; 
		r = a%10;
		q = a/10;
		res = r + q;
		System.out.println(res);
		
		
	}
	

}

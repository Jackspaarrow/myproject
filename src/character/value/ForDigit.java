package character.value;

public class ForDigit {

	public static void main(String[] args) {
		int a = 526 , sum = 0;
		for( ;a>0;)
		{
			sum = sum + (a%10);
			a = a/10;
		}
		System.out.println(sum);

	}

}

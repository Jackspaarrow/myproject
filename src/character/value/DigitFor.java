package character.value;

public class DigitFor {

	public static void main(String[] args) {
		int a = 4039 , b = 0;
		for( ;a>0; )
		{
			b = (b*10)+(a%10);
			a = a/10;
		}
		System.out.println(b);

	}

}

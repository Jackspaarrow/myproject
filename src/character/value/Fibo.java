package character.value;

public class Fibo {

	public static void main(String[] args) {
		int f = 0 , s = 1, t;
		for(int i = 1;i<=8;i++)
		{	

			System.out.println(f);
	
			t = f + s;
			f = s;
			s = t;
			
		}

	}

}

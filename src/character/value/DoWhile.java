package character.value;

public class DoWhile {

	public static void main(String[] args) {
		int a = 5;
		do
		{	
			int b = 5;
			do {	
					System.out.print("*");
					b--;
				}while(b>=a);
		System.out.println();
		a--;
		}while(a > 0);

	}

}

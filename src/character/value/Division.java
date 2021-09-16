package character.value;

public class Division {

	public static void main(String[] args) {
		for(int a = 10;a<=14;a++)
		{
			if(a%5 == 0)
			{
				System.out.println(a);
				break;
			}
			if(a==14)
			{
				System.out.println("The num is not divisiable");
			}
		}

	}

}

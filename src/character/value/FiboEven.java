package character.value;

public class FiboEven {

	public static void main(String[] args) {
		int a = 1 , f = 0 ,s = 1,t;
		while(a<=7)
		{	
			if(f%2 == 0) 
			{
				System.out.println(f);
			}
			t = f + s;
			f = s;
			s = t;
			a++;
		}
		

	}

}

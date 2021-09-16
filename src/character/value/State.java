package character.value;

public class State {
	int num = 1;
	static void india()
	{
		System.out.println("India is my country");
	}
	void fact()
	{
		int res = 1,a = 1;
		while(a<=num)
		{
			res = a * res;
			a++;
			
		}
		System.out.println(res);
	}
	void fabo()
	{
		int a = 1,f = 0,s = 1,t;
		while(a<=num)
		{
			System.out.println(f);
			t = f + s;
			f = s;
			s = t;
			a++;
		}
	}
	
	public static void main(String[] args) {
	  State a1 = new State();
	  State a2 = new State();
	  a1.num = 3;
	  a2.num = 5;
	  a1.india();
	  //a1.fact();
	  //a1.fabo();
	  a2.fabo();
	  a2.fact();
	  

	}

}

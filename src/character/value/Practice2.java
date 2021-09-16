package character.value;

public class Practice2 {

	public static void main(String[] args) 
	{
		Practice2 a1 = new Practice2();
		a1.sub();
		add();
		Fat();
	}
	static void add()
	{
		int a = 6,b = 5;
		System.out.println(a+b);
	}
		void sub()
	{
		int x = 7,y = 2;
		System.out.println(x-y);
	}
		static void Fat()
		{
			int a = 4 ,b , res,  f ,s;
			for(b = a; b>0;b--)
			{
				
				f = b;
				s = b - 1;
				res = f * s;
			}
			System.out.println();
			
		}
}

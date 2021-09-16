package character.value;

public class For{
		public static void main(String[] args) 
		{ 
			for(int i=0;i<=10;i= i+2)
			{ 
				System.out.println(i);
			}
			for (int i=0;i<=10;i++)
			{
				if(i%2 == 0)
				{
					System.out.println(i);
				}
			}
			for (int i=0;i<=10;i++)
			{
				if(i%2 != 0)  // if condition is ture , continue statement is repeat the condition check and the condition false next line executed  
				continue;
				
				System.out.println(i);
			}
			
		}
		
}

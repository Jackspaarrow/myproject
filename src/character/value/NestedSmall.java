package character.value;

public class NestedSmall {

	public static void main(String[] args) {
	 int a = 39,b = 390,c = 39;
	 if(a<b)
	 {
		 if(a<c)
		 {
			 System.out.println("a is Samll");
		 }else if(c<a)
		 {
			 System.out.println("c is small");
			 
		 }else
		 {
			 System.out.println(" a and c are small");
		 }
	 }else if(b<a)
	 {
		 if(b<c)
		 {
			 System.out.println("B is small");
		 }
	    else if(c<b)
	 	{
		 	System.out.println("c is small");
		}
	 	else
	 	{
	 		System.out.println("b and c are small");
	 	}
	 
	 }else if((c<a)&&(c< b))
	 {
		 System.out.println("c is small");
	 }else if((a<c)&&(b<c))
	 {
		 System.out.println("a and b is small");
	 }
	 else
	 {
		 System.out.println("Three values are same");
	 }
	 
  }
		 
}



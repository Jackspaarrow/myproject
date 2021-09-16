package character.value;

public class SingalDigit {

	public static void main(String[] args) {
		int a = 475674495,r,q,r1,to , s;
		r = a%10; // 6
		q = a/10; // 45
		a = q;  // a = 45
		r1 = r; // r1 = 6
		q = a/10;  // q = 4
		r = a%10; // r = 5;
		to = q + r + r1;
		System.out.println(to);
		r = to%10; // 5
		q = to/10; // 1
		s = r + q ;
		System.out.println(s);
		
		
		

	}

}

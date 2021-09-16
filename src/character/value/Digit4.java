package character.value;

public class Digit4 {

	public static void main(String[] args) {
		int r , q, a = 2568, q1, q2 ,res;
		q = a/10; // 2568/10 = 256
		r = a%10; // 2568%10 = 8
		q1 = r;
		a = q;
		q = a/10;  //256/10= 25
		r = a%10;  //256%10 =6
		q2 = r;
		a = q;
		q = a/10;  //25/10 = 2
		r = a%10;  //25/10 = 5
		res = q + r + q2 + q1;
		System.out.println(res);
		
		

	}

}

package character.value;

public class Digit4 {

	public static void main(String[] args) {
		int r , q, a = 2568, q1, q2 ,res;
		q = a/1000;
		r = a%1000;
		q1 = q;
		a = r;
		q = a/100;
		r = a%100;
		q2 = q;
		a = r;
		q = a/10;
		r = a%10;
		res = q + r + q2 + q1;
		System.out.println(res);
		
		

	}

}

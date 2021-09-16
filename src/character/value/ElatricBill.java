package character.value;

public class ElatricBill {

	public static void main(String[] args) {
		int unit = 600;
		float amount;
		if((unit>0)&&(unit<=100))
		{
			System.out.println("no due");
		}else if((unit>0)&&(unit<=200))
		{
			unit = unit - 100;
			amount = (unit  * 1.5f) + 20;
			System.out.println(amount);
		}else if((unit>=201)&&(unit<=500))
		{
			unit = unit - 100;
			amount = ((unit - 100) * 3) + (100*2)+30;
			System.out.println(amount);
		}else if(unit>500)
		{
			unit = unit - 100;
			amount = ((unit - 400)*6.5f) +(300 * 4.6f) +(100 * 3.5f)+50;
			System.out.println(amount);
			
		}

	}

}

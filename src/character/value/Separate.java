package character.value;

public class Separate {

	public static void main(String[] args) {
		char ch = 'b';
		//int integer = ch;
		//int ascii = integer-32;
		//char res = (char)ascii;
		
		switch(ch)
		{
		case 'a':
		case 'i':
		case 'o':
		case 'u':
		case 'w':
		case 'A':
		case 'I':
		case 'O':
		case 'U':
		case 'W':
		System.out.println("vowels");	
			break;
		default:
			System.out.println("consonant");
		
		}
		
	}

}

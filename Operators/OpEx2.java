import java.util.Scanner;
class OpEx2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch = sc.next().charAt(0);

		String op = ((ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')?((ch>='a'&&ch<='z')?(ch+" is a LowerCase Alphabet"):(ch+" isUpperCase Alphabet")):((ch>='0'&&ch<='9')?(ch+" is a Digit"):(ch+" is a SpecialCharacter")));
		System.out.println(op);
	}
}

import java.util.Scanner;
class Vowels 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char : ");
		char ch = sc.next().charAt(0);

		String a =((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?(ch+" is a VOWEL"):(ch+" is CONSONENT"));
		System.out.println(a);
	}
}

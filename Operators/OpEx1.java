import java.util.Scanner;
class OpEx1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char : ");
		int ch = sc.next().charAt(0);

		System.out.println((ch>='A'&&ch<='Z')?(ch+"is UpperCase"):(ch+"is not a UpperCase"));
	}
}

import java.util.Scanner;
class OpEx5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
		int ch = sc.next().charAt(0);

		System.out.println((ch>='0'&&ch<='9')?(ch+" is a Digit"):(ch+" is not a Digit"));
	}
}

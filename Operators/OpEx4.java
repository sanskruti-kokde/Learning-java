import java.util.Scanner;
class OpEx4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character  : ");
		int ch = sc.next().charAt(0);

		System.out.println((ch>='a'&&ch<='z')?(ch+" is LowerCase"):(ch+" is not LowerCase"));
	}
}

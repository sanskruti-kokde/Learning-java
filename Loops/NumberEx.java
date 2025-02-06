import java.util.Scanner;
class NumberEx
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();

		while (num>0)
		{
			int rem = num%10;
			System.out.println(rem);
			num = num/10;
		}
	}
}

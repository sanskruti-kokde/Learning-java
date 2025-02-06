import java.util.Scanner;
class EvenOddWithoutModulus2 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the num: ");
		int num = new Scanner(System.in).nextInt();

		System.out.println((num/2)*2==num);
	}
}

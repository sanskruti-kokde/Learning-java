import java.util.Scanner;
class OpEx3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num = sc.nextInt();

		String a = ((num%2==0&&num%5==0)?("HiTwoHiFive"):((num%5==0)?("HiFive"):((num%2==0)?("HiTwo"):("_____"))));

		System.out.println(a);
	}
}

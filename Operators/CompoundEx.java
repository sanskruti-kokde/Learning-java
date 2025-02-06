import java.util.Scanner;
class CompoundEx 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your makrs  : ");
		int m = sc.nextInt();

		String op = ((m<=100&&m>=75)?("A"):((m<=75&&m>=60)?("b"):((m<=60&&m>=35)?("C"):("Fail"))));
		int per = (m*100)/600;

		System.out.println("You got "+per+" %");
		System.out.print(op);
	}
}

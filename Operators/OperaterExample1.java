import java.util.Scanner;
class OperaterExample1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int ch = sc.next().charAt(0);

		System.out.println((ch>='A'&&ch<='Z')?(ch+"is a Upper case alphabet"):(ch+"is not a Upper acse alphabet"));
	}
}

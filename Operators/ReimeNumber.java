import java.util.Scanner
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num = sc.nextInt();

		System.ot.println((num==2||num==2)?(num+"is prime"):((num%2==0||num%3==0)?(num+" is not prime"):(num+"is prime")));
	}
}

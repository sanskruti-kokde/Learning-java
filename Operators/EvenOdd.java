import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		System.out.println("Enter the num: ");
		int num = new Scanner(System.in).nextInt();
        //(num/2==num/2.0)
		// integer==decimal
		//num/2== num/2.0;


		// (num/2*2==num)
		//(6/2*2==6)
		//3*2==6
		//6==6
		System.out.println(num%2==0);
		System.out.println((num/2)==num/2.0);
		System.out.println((num/2)*2==num);
	}
}
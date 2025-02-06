import java.util.Scanner;
class CalculateTip
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Subtotal : ");
		float bill = sc.nextFloat();

		System.out.print("Enter the Tip rate");
		float tip = sc.nextFloat();

        float tipAmount = (bill*tip)/100;
		float totallBill = (bill+tipAmount);


	 	System.out.println("The tip is "+tip+" and the total is "+totalBill);
	}
}

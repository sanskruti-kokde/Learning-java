import java.util.Scanner;
class CelsiFahre
{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius :");
		float temp = a.nextFloat();

		final float fahrenite = (temp*9/5)+32;

		System.out.println(temp+" Celsius is "+fahrenite+"Fahrenite");
	}
}
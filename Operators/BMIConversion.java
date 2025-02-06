import java.util.Scanner;
class BMIConversion
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the weight(pounds) :");
		float pounds = sc.nextFloat();

		System.out.println("Enter the height(inches) :");
		float inch = sc.nextFloat();

		final float kg = pounds*0.45359237f;
		final float meter = inch*0.0254f;

		final float bmi = kg/(meter*meter); 

		System.out.println("The BMI is :"+bmi);
	}
}

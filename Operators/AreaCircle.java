import java.util.Scanner;
class AreaCircle
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the radius(cm): ");
float radius= sc.nextFloat();
final float pi= 22/7;
float area = pi*(radius*radius);

System.out.println("The area of the circle is :" +area+ "cm^2");

//Perimeter of circle
float perimeter = 2*pi*radius;
System.out.println("The Perimeter of the circle is : "+perimeter+"sq cm");

}
}
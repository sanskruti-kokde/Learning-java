import java.util.Scanner;
class VolCylinder
{
 public static void main(String [] args )
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the radius(cm) : ");
	 float radius= sc.nextFloat();
	 final float pi = 22/7;

	 System.out.println("Enter the height(cm) : ");
	 float height = sc.nextFloat();
     float area = 3.14f*(radius*radius);
	 float volume = area*height;
	 System.out.println("The area of cylinder is :"+ area);
	 System.out.println("The volume of cylinder is : "+volume);
 }
}
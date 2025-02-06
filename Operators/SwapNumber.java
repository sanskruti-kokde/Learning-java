class SwapNumber
{
 public static void main(String [] args )
 {
  int a=2;
  int b=4;
  System.out.println("Before");
  System.out.println(a);
  System.out.println(b);

  int temp=a;
  a=b;
  b=temp;
 
  System.out.println("After");
  System.out.println(a);
  System.out.println(b);
 }
}
import java.util.Scanner;
class LoopEx6
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a string: ");
		String str = new Scanner(System.in).next().toUpperCase();

		for (int i= 0 ;i<str.length() ; )
		{
			char ch = str.charAt(i);
			if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				System.out.println(ch+":"+i+"  ");
			}
		}
	}
}

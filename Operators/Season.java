import java.util.Scanner;
class Season 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  month : ");
		String month = sc.next().charAt();

        String m = ((m==Oct||m==Nov||m==Dec||m==Jan)?("Winter"):
			       ((m==Feb||m==Mar||m==Apr||m==May)?("Summer"):
			       ((m==Jun||m==Jul||m==Aug||m==Sep)?("Momsoon"):("__"))));

		System.out.println(m);
	}
}

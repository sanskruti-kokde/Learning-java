import java.util.Scanner;
class SeasonProgram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  month : ");
		String month = sc.next().toUpperCase();

        String op = (month.equals("OCT"))||(month.equals("NOV"))||
			        (month.equals("DEC"))||(month.equals("JAN"))?("WINTER"):
			        (month.equals("FEB"))||(month.equals("MAR"))||
			        (month.equals("APR"))||(month.equals("MAY"))?("SUMMER"):
			        (month.equals("JUN"))||(month.equals("JUL"))||
			        (month.equals("AUG"))||(month.equals("SEP"))?("MONSOON"):"INVALID MONTH";

		System.out.println(op);
	}
}

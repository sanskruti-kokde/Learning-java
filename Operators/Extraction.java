class Extraction 
{
	public static void main(String[] args) 
	{
		int num=1234;
		int sum=0;

		int rem = num%10;
		sum= sum+rem;
		num= num/10;
		System.out.println(sum);

		rem = num%10;
		sum=sum+rem;
		num= num/10;
		System.out.println(sum);

		rem = num%10;
		sum= sum+rem;
		num= num/10;
		System.out.println(sum);

		rem = num%10;
		sum= sum+rem;
		num= num/10;
		System.out.println(sum);
	}
}

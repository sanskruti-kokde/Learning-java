class Products 
{
	public static void main(String[] args) 
	{
		int num = 3456;
		int mul = 1;

		int rem= num%10;
		mul=mul*rem;
		System.out.println(mul);
		
		num=num/10;
		rem= num%10;
		mul=mul*rem;
		System.out.println(mul);
		
		num=num/10;
		rem= num%10;
		mul=mul*rem;
		System.out.println(mul);
		
		num=num/10;
		rem= num%10;
		mul=mul*rem;
		System.out.println(mul);

		System.out.println("The product of the digits 3456 is : "+mul);

	}
}

class CondOperExa2
{
	public static void main(String[] args) 
	{
		int a= 10;
		int b = 20;
		int c = 22;
		int smallest = (a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		System.out.println(smallest);
	}
}

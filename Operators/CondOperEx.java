class CondOperEx 
{
	public static void main(String[] args) 
	{
		int a= 10;
		int b = 20;
		int c = 22;
		int lar = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println(lar);
	}
}

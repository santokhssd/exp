class Square{
	
	public static void main(String args[])
	{
		String s="";
		for(int i=0;i<7;i++)
		{
			s=s+"*/0";
		}
		System.out.println(s); s="*/";
		for(int i=0;i<5;i++)
		{
			s=s+" ";
		}s=s+"*/0";
		
		for(int i=0;i<5;i++)
		{
			System.out.println(s);
		} s="";
		for(int i=0;i<7;i++)
		{
			s=s+"*/";
		}
		System.out.println(s);
	}
}

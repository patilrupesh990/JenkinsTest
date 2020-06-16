class Ab
{
	public static void main(String args[])
	{
		int last=0,n=5;
		for(int i=0;i<=n;i++)
		{
			last=last+i;
			int l=i;
			for(int j=last;l>0;l--)
			{
				System.out.print(j--);
				if(l>1)
				{
					System.out.print("*");
					System.out.println("New Update modified");
				}			
			}
			System.out.println();
		}
	}
	
}

/*
1
3*2
4*5*6
10*9*8*7
11*12*13*14*15

*/

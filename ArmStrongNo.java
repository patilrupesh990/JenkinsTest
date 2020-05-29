import  java.util.Scanner;
class ArmStrongNo
{
	public static void main(String args[])
	{
		int armstrong=0,result=0;
		Scanner sc=new Scanner(System.in);
		int n=10;
		int check=n;
		while(n!=0)
		{
			armstrong=n%10;
			n=n/10;
			armstrong=armstrong*armstrong*armstrong;
			result=result+armstrong;
		}

		if(result==check)
			System.out.println("nob is Armstrong");
		else
			System.out.println("nob is not Armstrong");
			
	}

}
import java.util.Scanner ;
class Number
{
	public static void main(String[] args)
	{
		int i ,temp ;
		Scanner s = new Scanner(System.in) ;
		System.out.print("enter number of elements : ");
		int n = s.nextInt();
		int[] a = new int[n];
				System.out.println("enter numbers : ");
		for( i=0;i<n;i++)
		{
	
			a[i] = s.nextInt() ;
		}
		for(int k=1;k<=3;k++)
		{
			for(i=0;i<=n;i++)
			{
				a[n-1] = a[i] ;
				a[i] = a[i+1];
				
				if (i ==n)
					break ;
			}
		}
		System.out.print("left reverse array :"+a[i]);
				for(int k=1;k<=3;k++)
		{
			for(i=0;i<=n;i++)
			{
				a[n-1] = a[i] ;
				a[i] = a[i+1];
				
				if (i ==n)
					break ;
			}
		}
		System.out.print("left reverse array :"+a[i]);
	}
}

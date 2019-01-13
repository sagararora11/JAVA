import java.util.*;
class pascaltriangle
{
	public static void main(String args[])
	{
	int row,i,j,s,n=1;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the no. of rows to be displayed:");
	row=scan.nextInt();
	for(i=0;i<row;i++)
	{
	for(s=row;s>1;s--)
	{
	System.out.print("  ");
	}
	n=1;
	for(j=0;j<=i;j++)
	{
	System.out.print(n+"  ");
	n=n*(i-j)/(j+1);
	}
	System.out.println(  );
	}

	}
}
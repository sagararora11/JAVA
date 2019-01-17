import java.util.*;
class duplicate
{
	public static void main(String args[])
	{
	int k=0,i,j;
	int arr[]=new int[5];
	Scanner input=new Scanner(System.in);
	System.out.println("Enter 5 integer nos.");
	for(i=0;i<5;i++)
	{
	do
	{
	if(k>=1)
	System.out.println("Enter again");
	arr[i]=input.nextInt();
	k++;
	}
	while(arr[i]<10||arr[i]>100);
	k=0;
	if(i!=0)
	{
	for(j=0;j<i;j++)
	{
	if(arr[j]==arr[i])
	break;
	else
	{
	System.out.println("No. entered"+arr[i]);
	break;
	}
	}
	}
	else
	System.out.println("No. entered"+arr[i]);
	}
	}
}
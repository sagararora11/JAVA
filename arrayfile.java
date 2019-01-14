import java.util.*;
class arrayfile{
	public static void main(String args[])
	{
	Scanner array= new Scanner(System.in);
	int arr[]=new int[5];
	int i,j,k=0;
	System.out.println("enter the values for array between 10 and 100:");
	for(i=0;i<5;i++)
	{    
		for (j=0;j<5;j++)
		{
		do
		{
			if(k>=1)
         	System.out.println("enter the value again:");
			 arr[i]=array.nextInt();
			 k++;

		}

    
         while (arr[i]<10 || arr[i]>100);
         k=0;

     }
	}
	System.out.println("following array is made:");
	for(i=0;i<5;i++)
	System.out.println(arr[i]);
	
	}
}
import java.util.*;
class Stackmain
{
	public static void main(String[]args)
	{
		Stack s1=new Stack();
	int c;
	Scanner sc=new Scanner(System.in);
	do{
		System.out.println("1.push\n 2.pop\n 3.spaceleft\n 4.isEmpty\n 5.isFull\n 6.Exit\n");
		c=sc.nextInt();
		switch(c)
		{
			case 1:
			System.out.println("Enter the value");
			 int n=sc.nextInt();
			s1.push(n);
			break;
			case 2: 
			s1.pop();
			break;
			case 3: 
			System.out.println(s1.spaceleft());
			break;
			case 4:
			System.out.println(s1.isEmpty());
			break;
			case 5:
			System.out.println(s1.isFull());
			break;
			case 6:
			System.out.println("Enter '6' to exit");
			break;
			default:
			System.out.println("Enter a correct choice");
		}

		}while(c!=6);
	}
	}

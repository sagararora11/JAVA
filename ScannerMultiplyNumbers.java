import java.util.*;
public class ScannerMultiplyNumbers
{
	public static void main(String[] args)
	{
	Scanner console=new Scanner(System.in);
	System.out.print("please type two numbers:");
	int num1=console.nextInt();
	int num2=console.nextInt();
	int prod=num1*num2;
	System.out.println("The Product is "+prod);
	System.out.println(args[0]);

	}
}
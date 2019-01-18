import java.util.*;
class distancemain
{
	public static void main(String args[])
	{
	float feet1,feet2,inch1,inch2;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter distance in feet");
	feet1=in.nextInt();
	System.out.println("Enter distance in inch");
	inch1=in.nextInt();
	System.out.println("Enter distance in feet");
	feet2=in.nextInt();
	System.out.println("Enter distance in inch");
	inch2=in.nextInt();
	distance d2=new distance();
	distance d1=new distance(feet1,inch1);
	d2=d1.add(d2);
    distance d3=new distance(feet2,inch2);
    d2=d3.add(d2);
    System.out.println(d2.feetdistance+" "+d2.inchdistance);

    }

}
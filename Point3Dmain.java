import java.util.*;
class Point3Dmain
{
	public static void main(String args[])
	{
	float n=0.0f,n1,n2;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the no.");
	n=in.nextFloat();
	n1=in.nextFloat();
    n2=in.nextFloat();
	Point3D ob=new Point3D(n,n1,n2);
	ob.setxyz(n,n1,n2);
	float f3[]=ob.getxyz();
	System.out.println(f3[0]+" "+f3[1]+" "+f3[2]);
	String k=ob.tostring();
	System.out.println("output: "+k);
	}
}
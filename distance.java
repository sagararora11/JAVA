import java.util.*;
class distance
{
	float feetdistance,inchdistance;
	double z;
	distance(float x,float y)
	{
	feetdistance=x;
	inchdistance=y;
	}
	distance()
	{
	feetdistance=0;
	inchdistance=0;
	}
	distance add(distance z)
	{
		z.feetdistance=z.feetdistance+feetdistance;
		z.inchdistance=z.inchdistance+inchdistance;
		
		return z;
	}
	

}
class Point2D
{
	float x=0.0f;
	float y=0.0f;
	Point2D(float a,float b)
	{
		x=a;
		x=b;
	}
	Point2D()
	{
		x=0;
		y=0;

	}
	float getx()
	{
		return x;

	}
	void setx(float a)
	{
		x=a;
	}
	float gety()
	{
		return y;

	}
	void sety(float b)
	{
		y=b;
	}
	void setxy(float a,float b)
	{
		x=a;
		y=b;
	}
	float[] getxy()
	{
     float f[]=new float[2];
     f[0]=x;
     f[0]=y;
     return (f); 
	}
	String tostring()
	{
		return (x+" "+y);
	}


}

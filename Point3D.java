class Point3D extends Point2D
{
	float z=0.0f;
    Point3D(float a,float b,float c)
    {
    super(a,b);
    z=c;
    }
    Point3D()
    {
    super();
    z=0;
    }
    float getz()
    {
    return z;
    }
    void setz(float c)
    {
    z=c;
    }
    void setxyz(float a,float b,float c)
    {
    setxy(a,b);
    z=c;
    }
    float[] getxyz()
    {
    float f1[]=new float[3];
    float[] f = new float[2];
    f=getxy();
    f1[0]=f[0];
    f1[1]=f[1];
    f1[2]=z;
    return f1;
    }
    String tostring()
    {
    return(x+" "+y+" "+" "+z);
    }
}
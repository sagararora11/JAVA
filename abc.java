class abc
{
	int data;
	abc()
	{
	data=0;
	}
	abc(int i)
	{
	data=i;
	}
	void display()
	{
	System.out.println(data);
	}
}
class mainclass
{
	public static void main(String[] args)
	{
	abc A=new abc();
	A.display();
	abc B=new abc(100);
	B.display();
	}
}
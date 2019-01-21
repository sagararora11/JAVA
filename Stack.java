class Stack
{
	int arr[]=new int[10];
	int tos;

void push(int a){
	if(!isFull())
	{
	tos++;
	arr[tos]=a;
	}
}
void pop(){
	tos--;
}
boolean spaceleft(){
	if(tos<9)
	return true;
	else
	return false;

}
boolean isEmpty(){
	if(tos==-1)
		return true;
    else
    	return false;
}
boolean isFull(){
	if (tos==9)
	return true;
	else
	return false;
}
}

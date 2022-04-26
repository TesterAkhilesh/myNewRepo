package HelloJava;

public class Seven {

	int addodd=0;
	int addeven=0;
	void Print()
	{
		 int a=1;
		 while (a<=10)
		{
			System.out.println("number is "+ a);
			
		a=a+1;
		
		if (a%2==0)
		{   System.out.println("even");
		addeven = addeven +a;
			}	
	else
	{
		System.out.println(a+" is odd number");
		addodd = addodd + a;
	}
	
	}}
	
public static void main(String[] args) {
	Seven obj = new Seven();
	obj.Print();
}

}
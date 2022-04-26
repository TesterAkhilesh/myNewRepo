package HelloJava;

public class Eight {

	int add=0;
	
		void addition()
	
		{
		for (int a=1; a<=5; a++)
		{
			System.out.println("number is "+ a);
		
			add= add + a ;
		}
	System.out.println("Total sum is " + add);
	
		}

public static void main(String[] args) {
	Eight obj = new Eight();
	obj.addition();
} 


}

package HelloJava;

public class Sixth {

	int add=0;
	 void Print()
	 {
		 for (int a=6 ; a<=10; a++)
		 {System.out.println("number is "+ a);
		 
		 
		 add= add + a;
		 }
		 
			 System.out.println("Total sum is " + add);
		 
	 }
	 
	 
public static void main(String[] args) {
	Sixth obj = new Sixth();
	obj.Print();
}

}

package HelloJava;

public class Second {

	int integer=10;
	float Floatvariable=10.6f;
	char character='m';
	String stringvariable="I live in Pimpri";
	
	void print()
	{
		System.out.println(integer);
		System.out.println(Floatvariable);
		System.out.println(character);
		System.out.println(stringvariable);
		
	}
	
	public static void main(String[] args) {
		Second obj =new Second();
		obj.print();
		
	}
	}

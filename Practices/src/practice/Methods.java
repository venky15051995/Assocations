package practice;

public class Methods {

	// The access modifiers like static ,final ,abstratc, native, synchronized,
	// strictfp, allowed for methods

	// static final ---valid
    // static abstratc -invalid 
	// final abstratc -invalid
	
	// static synchronized -valid
	// final synchronized -valid
	
	int a =10;
	float b=(float) 10.0;
	public int m1() {
		
		int a=11;
		int b=22;
		int c;
		
		
		c=a+b;

		
		return c;
		

		
	}

	public static void main(String[] args) {
		Methods a=new Methods();
		
		int c=a.m1();
		System.out.println(c);
		
	}

}

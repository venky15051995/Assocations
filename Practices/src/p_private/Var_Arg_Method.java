package p_private;

public class Var_Arg_Method {
	
	
	void add(float  f, int ...a ) {
		
		//System.out.println(a.length);
		
		System.out.println(f+" "+a);
		
		
		
		
	}

	public static void main(String[] args) {
		Var_Arg_Method v =new Var_Arg_Method();
		
		v.add(10);
		v.add(10.0f,20,30);
		v.add(10,20,30);
		
		//System.out.println(v.hashCode());
		
		
		
	}

}

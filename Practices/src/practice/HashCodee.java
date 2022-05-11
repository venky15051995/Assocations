package practice;

public class HashCodee {

	int a=10;
	public void hash() {
         System.out.println();
	} 
	
	
         public String toString() {
        	 
        	 
        	 return "venky";
        	 }
         
	

	public static void main(String[] args) {

		HashCodee h = new HashCodee();
		
		System.out.println(h);  //internally .toString() method will be executed

		int hashcode = h.hashCode();

		System.out.println(hashcode);

		String ref = h.toString();

		System.out.println(ref);
		
		


	}
	}


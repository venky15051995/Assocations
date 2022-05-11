package mutable_Immutable;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("venky");
		String str2 = str1.concat("SOFTWARE") ;
		String str3 = str2.concat("pro");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println();
		
		
		StringBuffer b1 =new StringBuffer("durga");

		StringBuffer b2 =b1.append(" soft");

		StringBuffer b3=b2.append(" solu");
		
		System.out.println(b1);
		//System.out.println(b2);
		//System.out.println(b3);

		
	

}}

package comm.many_to_many_entities;

public class Test {

	
	
	public static void main(String[] args) {
		
		Course c1=new Course(111,"JAVA",5000);
		Course c2=new Course(222,"PYTHON",3000);
		
	    Course[] courses1= {c1,c2};
	
	      Student s1=new Student("101","Venky","khammam", courses1);
	      Student s2=new Student("102","mani","khammam", courses1);
	     
	
	         
	      
	      
	      s1.getStudentDetails();
	      s2.getStudentDetails();
	      
	      
	
		
	}

}

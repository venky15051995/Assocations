package comm.many_to_many_entities;

public class Student {

	private String sId;
	private String sName;
	private String sAdd;
	private Course[] courses;
	
	
	
	public Student( String sId,
	 String sName,
	 String sAdd,
	 Course[] courses){
		
		
		
		
		
		
	}
	
	//sId
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	
	//sName
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	//sAdd
	public String getsAdd() {
		return sAdd;
	}
	public void setsAdd(String sAdd) {
		this.sAdd = sAdd;
	}
	
	//courses
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
  
	
	
	
	
	public void getStudentDetails() {
		
		System.out.println("Student Details");
		System.out.println("-------------------");
		System.out.println("Student Id "+sId);
		System.out.println("Student NAme "+sName);
		System.out.println("student Address "+sAdd);
		System.out.println();
		System.out.println("CID\tCNAME\tCCOST");
		
		for(Course c:courses) {
			
			System.out.println(c.getcId()+"\t");
			System.out.println(c.getcName()+"\t");
			System.out.println(c.getcCost()+"\n");
			
			
			
			
			
			
		
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}

package comm.many_to_many_entities;

public class Course {

	private int cId;
	private String cName;
	private int cCost;
	
	
	
	
	
	public Course(int cId,String cName, int cCost) {
		this.cId=cId;
		this.cName=cName;
		this.cCost=cCost;
		
	}
	//cId
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	
	//cName
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	
//	/cCost
	public int getcCost() {
		return cCost;
	}
	public void setcCost(int cCost) {
		this.cCost = cCost;
	}
	
	
	
	
}

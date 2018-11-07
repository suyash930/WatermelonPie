package model;

public class Teacher {
	
	private String schoolId;
	private String name;
	private String designation;
	
	public Teacher() {
		//default constructor
	}
	
	public Teacher(String schoolId, String name, String designation) {
		super();
		this.schoolId = schoolId;
		this.name = name;
		this.designation = designation;
	}
	public String getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}

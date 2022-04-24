
public class Student {
    private String name; 
    private String gender;
    private String program;
    private String address;
    private int matric;
    private String dateOfBirth;
    private int semester;
    private String contactNum;
	    
    public Student(String name, String gender, String program, String address, int matric, String dateOfBirth, int semester, String contactNum) {
	this.name = name;
	this.gender = gender;
	this.program = program;
	this.address = address;
	this.matric = matric;
	this.dateOfBirth = dateOfBirth;
	this.semester = semester;
	this.contactNum = contactNum;    
    }
    public String getName() {
	return name;
    }
    public void setName(String name) {
	this.name = name;
    }
    public int getMatric() {
	return matric;
    }
    public void setMatric(int matric) {
	this.matric = matric;
    }    
    public String getProgram() {
	return program;
    }
    public void setProgram(String program) {
	this.program = program;
    }
    public String getAddress() {
	return address;
    }
    public void setAddress(String address) {
	this.address = address;
    }
    public String getDateOfBirth() {
	return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
    }
    public int getSemester() {
	return semester;
    }
    public void setSemester(int semester) {
	this.semester = semester;
    }
    public String getContactNum() {
	return contactNum;
    }
    public void setContactNum(String contactNum) {
	this.contactNum = contactNum;
    }
    public String getGender() {
	return gender;
    }
    public void setGender(String gender) {
	this.gender = gender;
    }	        
    @Override
    public String toString(){
        return ("Name : "+ name + "\nGender : "+ gender + "\nProgram : " + program +"\nAddress : "+ address +"\nMatric Number : "+ matric +"\nDate of Birth "+ dateOfBirth +"\nSemester : "+ semester +"\nContact Number : "+ contactNum +"\n");
    }
}

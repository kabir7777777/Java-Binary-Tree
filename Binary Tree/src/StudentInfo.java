
public class StudentInfo {
	
	
	public int studentNumber;
	public String firstName;
	public String lastName;
	public StudentInfo next;
	public StudentInfo left;
	public StudentInfo right;
	
	public StudentInfo(int studentNumber, String fN, String lastName) {
		this.studentNumber = studentNumber;
		firstName = fN;
		this.lastName = lastName;
		left = null;
		right = null;

	}
	
	
}

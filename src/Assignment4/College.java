package Assignment4;

public class College {
    
	private int studentId;
	private String studentName;
	private String course;
	private int admissionNumber;
	
	public College() {
		
	}
	
	public College(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public College(int studentId, String studentName, String course) {
		this.studentId = studentId;
		this.studentName = studentName;
	    this.course = course;
	}
	
	public College(int studentId, int admissionNumber) {
		this.studentId = studentId;
		this.admissionNumber = admissionNumber;
	}
	
	private static void displayStudentInfo(College student) {
        System.out.println("Student ID: " + student.studentId);
        System.out.println("Student Name: " + student.studentName);
        System.out.println("Course: " + student.course);
        System.out.println("Admission Number: " + student.admissionNumber);
        System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        College student1 = new College(1,"John Doe");
        College student2 = new College(2,"Jane Doe","Computer Science");
        College student3 = new College(3,"Alice Smith","Mathematics");
        College student4 = new College(4, 45367);
        College student5 = new College(5, "Bob Johnson");
		
        displayStudentInfo(student1);
        displayStudentInfo(student2);
        displayStudentInfo(student3);
        displayStudentInfo(student4);
        displayStudentInfo(student5);
        
	}
	
}

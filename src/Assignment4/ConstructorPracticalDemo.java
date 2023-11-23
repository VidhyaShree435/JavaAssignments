package Assignment4;

   class College {
    
	private int sId;
	private String sName;
	private String course;
	private int admno;
	
	College() {
		
	}
	
    College(int studentId, String studentName) {
		this.sId = studentId;
		this.sName = studentName;
	}
	
	College(int studentId, String studentName, String course) {
		this.sId = studentId;
		this.sName = studentName;
	    this.course = course;
	}
	
	College(int studentId, int admissionNumber) {
		this.sId = studentId;
		this.admno = admissionNumber;
	}
	
	public static void displayStudentInfo(College student) {
        System.out.println("Student ID: " + student.admno);
        System.out.println("Student Name: " + student.sName);
        System.out.println("Course: " + student.course);
        System.out.println("Admission Number: " + student.admno);
        System.out.println();
	}
	
 }
	
    public class ConstructorPracticalDemo{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        College student1 = new College(1,"John Doe");
        College student2 = new College(2,"Jane Doe","Computer Science");
        College student3 = new College(3,"Alice Smith","Mathematics");
        College student4 = new College(4, 45367);
        College student5 = new College(5, "Bob Johnson");
		
        College.displayStudentInfo(student1);
        College.displayStudentInfo(student2);
        College.displayStudentInfo(student3);
        College.displayStudentInfo(student4);
        College.displayStudentInfo(student5);
	}
	
}
	


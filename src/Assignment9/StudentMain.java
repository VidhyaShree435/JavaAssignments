package Assignment9;

import java.util.Scanner;

import javax.management.remote.SubjectDelegationPermission;

class Student{
	int sid;
    String sname;
	String classname;
	
	public Student(int sid,String sname,String studentclass) {
		this.sid = sid;
		this.sname = sname;
		this.classname = studentclass;
	}
	
}
	
class Marks extends Student{
     
	int m1,m2,m3;
	
	public Marks(int sid, String sname, String studentclass, int m1,int m2,int m3) {
		super(sid, sname, studentclass);
		// TODO Auto-generated constructor stub
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public void displayMarks() {
        System.out.println("Marks: M1 = " + m1 + ", M2 = " + m2 + ", M3 = " + m3);
    }
	
 } 

class Result extends Marks {
    
	int tot;
	double avrge;	
	
	public Result(int sid, String sname, String studentclass, int m1, int m2, int m3) {
		super(sid, sname, studentclass, m1, m2, m3);
		// TODO Auto-generated constructor stub
		this.tot = m1+m2+m3;
		this.avrge = tot/3.0;
		
	}
	
	public void showResult() {
		System.out.println("Total Marks: "+ tot);
		System.out.println("Average Marks: "+ avrge);
	}
	
	public void ReadVariables() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sid : ");
		this.sid = scanner.nextInt();
		
		System.out.println("Enter sname : ");
		this.sname = scanner.nextLine();
		
		System.out.println("Enter Student Name : ");
		this.classname = scanner.nextLine();
		
		System.out.println("Enter m1 : ");
		this.m1 = scanner.nextInt();
		
		System.out.println("Enter m2 : ");
		this.m2 = scanner.nextInt();
		
		System.out.println("Enter m3 : ");
		this.m3 = scanner.nextInt();
		
	}
	
}



public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Result result = new Result(1, "John", "10th", 90, 85, 88);

	        // Display student details
	        System.out.println("Student Details:");
	        System.out.println("ID: " + result.sid);
	        System.out.println("Name: " + result.sname);
	        System.out.println("Class: " + result.classname);

	        // Display marks
	        result.displayMarks();

	        // Display result
	        result.showResult();
			
	}

}

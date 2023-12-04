package Assignment12;


class Student{
	private int age;
	private String name;
	private double grade;
	
	Student(int age,String name,double grade){
		this.age = age;
		this.name = name;
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public void display() {
		System.out.println("Student age is :"+ age);
		System.out.println("Student name is : "+name);
		System.out.println("Student grade is :"+grade);
	}
	
}

public class EncapsulationMainMethod {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an instance of the Student class
		Student student1 = new Student(35,"John Doe",35.00);
		// Accessing information using getter methods
		System.out.println("Name : "+ student1.getName());
		System.out.println("Age : "+student1.getAge());
		System.out.println("Grade :"+ student1.getGrade());
		
		// Modifying information using setter methods
		student1.setName("Modify Name");
		student1.setAge(34);
		student1.setGrade(34.00);
		
		// Displaying updated information
		student1.display();

	}

}

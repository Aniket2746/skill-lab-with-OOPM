package lab;
import java.util.Scanner;
class Employee{
	
	Scanner sc=new Scanner(System.in);
	int EmpId ,EmpSalary;
	void getInput() {
	System.out.println("Enter Employee ID:");	
	EmpId =sc.nextInt();
	System.out.println("Enter Employee Salary:");	
	EmpSalary =sc.nextInt();
	}
}
class permenantEmployee extends  Employee{
	double hike=0.10;
	double Total;
	void generate_salary() {
		Total=EmpSalary+EmpSalary*hike;
		System.out.println("Total salary ="+Total);
	}
}
class temporaryEmployee extends  Employee{
	double hike=0.05;
	double Total;
	void generate_salary() {
		Total=EmpSalary+EmpSalary*hike;
		System.out.println("Total salary ="+Total);
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permenantEmployee p=new permenantEmployee();
		System.out.println("Information for permanant Employee");
        p.getInput();
        p.generate_salary();
        temporaryEmployee t=new temporaryEmployee();
        System.out.println("");
		System.out.println("Information for temporary Employee");
        t.getInput();
        t.generate_salary();
	}

}

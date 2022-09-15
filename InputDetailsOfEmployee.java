package EmployeeDetailsAndTasks;
import java.util.*;
public class InputDetailsOfEmployee {

	public Employee[] EmployeeDetails(Scanner sc){

		int n,id,age;
		double salary;
		char gender;
		String name,designation,validate;
		System.out.print("Enter the total number of employees: ");
		n=sc.nextInt();
		Employee empObjects[]=new Employee[n];
		for (int i=0;i<n;i++) {
			System.out.println("Enter the details of employee "+(i+1)+" :");
			empObjects[i]=new Employee();
			System.out.print("Enter the employee ID: ");
			id=sc.nextInt();
			empObjects[i].setEmpId(id);
			
			sc.nextLine();
			System.out.print("Enter the name: ");
			name=sc.nextLine();
			empObjects[i].setName(name);
			
			System.out.print("Enter the age: ");
			age=sc.nextInt();
			empObjects[i].setAge(age);
			
			System.out.print("Enter the salary: ");
			salary=sc.nextDouble();
			empObjects[i].setSalary(salary);
			
			System.out.print("Enter the designation: ");
			designation=sc.next();
			empObjects[i].setDesignation(designation);
			
			System.out.print("Enter the gender: Type 'M' for Male and 'F' for Female. ");
			gender=sc.next().charAt(0);
			empObjects[i].setGender(gender);
			
			System.out.println("Is he/she a permanent employee? Type 'yes' or 'no': ");
			validate=sc.next();
			if((validate.toUpperCase()).equals("YES"))
				empObjects[i].setPermanentEmployeee(true);
			else
				empObjects[i].setPermanentEmployeee(false);
		}
		
		System.out.println("THE DETAILS OF EMPLOYEES ARE:\n--------------------------------------------------------------------------------------------------------------\nID\tNAME\tAGE\tSALARY\t\tDESIGNATION\tGENDER\tPERMANENT?\n\n");
		for(int i=0;i<n;i++) {
			System.out.println(empObjects[i].getEmpId()+"\t"+empObjects[i].getName()+"\t"+empObjects[i].getAge()+"\t"+empObjects[i].getSalary()+"\t\t"+empObjects[i].getDesignation()+"\t\t"+empObjects[i].getGender()+"\t\t"+empObjects[i].isPermanentEmployeee());
		}
		return empObjects;
	}

}

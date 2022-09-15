/** Create a class called Employee with the following attributes:
 * 1. int empId
 * 2. String name
 * 3. int age
 * 4. double salary
 * 5. String designation
 * 6. boolean permanentEmployeee
 * 
 * Make all the attributes as private and generate getter and setters
 */
package EmployeeDetailsAndTasks;

public class Employee {
	private int empId;
	private String name;
	private int age;
	private double salary;
	private String designation;
	private char gender;
	private boolean permanentEmployeee;
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean isPermanentEmployeee() {
		return permanentEmployeee;
	}
	
	public void setPermanentEmployeee(boolean permanentEmployeee) {
		this.permanentEmployeee = permanentEmployeee;
	}
	
}

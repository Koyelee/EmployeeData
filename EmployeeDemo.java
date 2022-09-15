package EmployeeDetailsAndTasks;
import java.util.*;
public class EmployeeDemo {
	
// 1. Find an employee by Employee ID.
	public static Employee findEmployee(Employee emp[],int id) {
		for (int i=0;i<emp.length;i++) {
			if(emp[i].getEmpId()==id) {
				return emp[i];
			}
		}
		return null;
	}

// 2. Update salary of an employee.
	public static double updateSalary(Employee e, double value, Employee emp[]) {
		for(int i=0;i<emp.length;i++) {
			if(e==emp[i]) {
				emp[i].setSalary(value);
				break;
			}
		}
		return value;
	}
	
// 3. Deduct salary of an employee.
	public static double deductSalary(Employee e,double value,Employee emp[]) {
		for(int i=0;i<emp.length;i++) {
			if(e==emp[i]) {
				emp[i].setSalary(value);
				break;
			}
		}
		return value;
	}
	
// 4. Find the average age of the employees.
	public static double averageAgeOfEmployee(Employee e[]) {
		int sum=0;
		for(int i=0;i<e.length;i++)
			sum+=e[i].getAge();
		double averageAge=(float)sum/(float)e.length;
		return averageAge;
	}
	
// 5. Find the average age of the male employees.
	public static double averageAgeOfMaleEmployees(Employee e[]) {
		int maleSum=0,count=0;
		for (int i=0;i<e.length;i++) {
			if(e[i].getGender()=='M' || e[i].getGender()=='m') {
				maleSum+=e[i].getAge();
				count++;
			}
		}
		double avgMaleAge=(float)maleSum/(float)count;
		return avgMaleAge;
	}
	
// 6. Find the maximum salary of the employee.
	public static Employee findMaxSalaryOfAnEmployee(Employee e[]) {
		Employee m=e[0];
		double maxSal=e[0].getSalary();
		for (int i=0;i<e.length;i++) {
			if(maxSal<e[i].getSalary()) {
				maxSal=e[i].getSalary();
				m=e[i];
			}
		}
		return m;
	}
	
// 7. Find the minimum salary of an employee.
	public static Employee findMinSalaryOfAnEmployee(Employee e[]) {
		Employee m=e[0];
		double minSal=e[0].getSalary();
		for (int i=0;i<e.length;i++) {
			if(minSal>e[i].getSalary()) {
				minSal=e[i].getSalary();
				m=e[i];
			}
		}
		return m;
	}
	
// 8. Sort the list of employees on the basis of their age.
	public static Employee[] sortEmployeeBasedOnAge(Employee e[]) {
		// Sorting the ages of the Employees with the help of Bubble Sort
		int flag;
		Employee temp;
		for(int i=0;i<e.length-1;i++)
		  {
		  	flag=0;
		  	for(int j=0;j<e.length-i-1;j++)
		  	{
		  		if(e[j].getAge()>e[j+1].getAge())
		  		{
		  			temp=e[j];
		  			e[j]=e[j+1];
		  			e[j+1]=temp;
		  			flag=1;
				}
			}
			if(flag==0)
			break;
		  }
		return e;
	}
	
// 9. Search an employee by designation.
	public static Employee[] searchEmployeeWithDesignation(Employee e[],String designation) {
		Employee em[]=new Employee[e.length];
		int k=0;
		for (int i=0;i<e.length;i++) {
			if(e[i].getDesignation().equalsIgnoreCase(designation)) {
				em[k]=e[i];
				k++;
			}
		}
		if(k==0)
			return null;
		else {
			e=new Employee[k];
			for(int i=0;i<e.length;i++)
				e[i]=em[i];
			return e;
		}
	}
	
//10. Get details of an employees whose salary is greater than 25000 and is a permanent employee.
	public static Employee[] getDetailsOfAnEmployee(Employee e[]) {
		Employee em[]=new Employee[e.length];
		int k=0;
		for(int i=0;i<e.length;i++) {
			if(e[i].getSalary()>25000 && e[i].isPermanentEmployeee()==true) {
				em[k]=e[i];
				k++;
			}
		}
		if(k==0)
			return null;
		else {
			e=new Employee[k];
			for(int i=0;i<e.length;i++)
				e[i]=em[i];
			return e;
		}
	}
	
// 11. Search an employee with designation sorted by Employee ID.
	public static Employee[] searchEmployeeWithDesignationSortedById(Employee e[],String designation) {
		e=searchEmployeeWithDesignation(e, designation);
		if(e==null)
			return null;
		else {
			// Sorting the Employee ID of the Employees with given designation using Bubble Sort
			int flag;
			Employee temp;
			for(int i=0;i<e.length-1;i++)
			  {
			  	flag=0;
			  	for(int j=0;j<e.length-i-1;j++)
			  	{
			  		if(e[j].getEmpId()>e[j+1].getEmpId())
			  		{
			  			temp=e[j];
			  			e[j]=e[j+1];
			  			e[j+1]=temp;
			  			flag=1;
					}
				}
				if(flag==0)
				break;
			  }
			return e;
		}
	}
	
// 	12. Find the employees whose age is more than the average age.
	public static Employee[] findEmployeesMoreThanAverageAge(Employee e[]) {
		double avgAge=averageAgeOfEmployee(e);
		Employee greaterAvg[]=new Employee[e.length];
		int count=0;
		for(int i=0;i<e.length;i++) {
			if(e[i].getAge()>avgAge) {
				greaterAvg[i]=e[i];
				count++;
			}
		}
		Employee emp[]=new Employee[count];
		for(int i=0;i<count;i++)
			emp[i]=e[i];
		return emp;
	}
	
// Main Method To Call The member Methods.
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		InputDetailsOfEmployee ob=new InputDetailsOfEmployee();
		Employee emp[]=ob.EmployeeDetails(sc);
		Employee max,min,emp1[];
		int ch,id,flag;
		double value;
		String designation;
		while (true) {
			System.out.println("\n--------------------------------------------------------------------------------------------------------------\n** MENU **\n1. Find an employee by Employee ID.\n2. Update salary of an employee.\n3. Deduct salary of an employee.\n4. Find the average age of the employees.\n5. Find the average age of the male employees.\n6. Find the maximum salary of the employee.\n7. Find the minimum salary of an employee.\n8. Sort the list of employees on the basis of their age.\n9. Search an employee by designation.\n10. Get details of an employees whose salary is greater than 25000 and is a permanent employee.\n11. Search an employee with designation sorted by Employee ID.\n12. Find the employees whose age is more than the average age.\n13. Exit\n--------------------------------------------------------------------------------------------------------------\nEnter your choice.");
			ch=sc.nextInt();
			switch(ch) {
			
				case 1:
					System.out.print("Enter the ID: ");
					id=sc.nextInt();
					Employee e=findEmployee(emp,id);
					if(e==null)
						System.out.println("THE GIVEN EMPLOYEE ID IS NOT PRESENT IN THE GIVEN LIST.");
					else {
						System.out.println("\n--------------------------------------------------------------------------------------------------------------\nID\tNAME\tAGE\tSALARY\t\tDESIGNATION\tGENDER\tPERMANENT?\n\n");
						System.out.println(e.getEmpId()+"\t"+e.getName()+"\t"+e.getAge()+"\t"+e.getSalary()+"\t\t"+e.getDesignation()+"\t\t"+e.getGender()+"\t\t"+e.isPermanentEmployeee());
					}
					break;
				
				case 2:
					flag=0;
					System.out.print("Enter the ID of the employee whose salary is to be updated: ");
					id=sc.nextInt();
					for(int i=0;i<emp.length;i++) {
						if (id==emp[i].getEmpId()) {
							System.out.print("Enter the updated salary: ");
							value=sc.nextDouble();
							flag=1;
							updateSalary(emp[i],value,emp);
							System.out.println("THE UPDATED DATA IS: ");
							System.out.println("\n--------------------------------------------------------------------------------------------------------------\nID\tNAME\tAGE\tSALARY\t\tDESIGNATION\tGENDER\tPERMANENT?\n\n");
							System.out.println(emp[i].getEmpId()+"\t"+emp[i].getName()+"\t"+emp[i].getAge()+"\t"+emp[i].getSalary()+"\t\t"+emp[i].getDesignation()+"\t\t"+emp[i].getGender()+"\t\t"+emp[i].isPermanentEmployeee());
							break;
						}
					}
					if (flag==0)
						System.out.println("Employee with given Employee ID does not exist and hence no salary was updated.");
					break;
				
				case 3:
					flag=0;
					System.out.print("Enter the ID of the employee whose salary is to be deducted: ");
					id=sc.nextInt();
					for(int i=0;i<emp.length;i++) {
						if (id==emp[i].getEmpId()) {
							System.out.print("Enter the deducted salary: ");
							value=sc.nextDouble();
							flag=1;
							updateSalary(emp[i],value,emp);
							System.out.println("THE UPDATED DATA IS: ");
							System.out.println("\n--------------------------------------------------------------------------------------------------------------\nID\tNAME\tAGE\tSALARY\t\tDESIGNATION\tGENDER\tPERMANENT?\n\n");
							System.out.println(emp[i].getEmpId()+"\t"+emp[i].getName()+"\t"+emp[i].getAge()+"\t"+emp[i].getSalary()+"\t\t"+emp[i].getDesignation()+"\t\t"+emp[i].getGender()+"\t\t"+emp[i].isPermanentEmployeee());
							break;
						}
					}
					if (flag==0)
						System.out.println("Employee with given Employee ID does not exist and hence no salary was deducted.");
					break;

				case 4:
					System.out.println("THE AVERAGE AGE OF THE EMPLOYEES OF THE GIVEN DATA: "+averageAgeOfEmployee(emp)+" years");;
					break;
					
				case 5:
					System.out.println("THE AVERAGE AGE OF THE MALE EMPLOYEES OF THE GIVEN DATA: "+averageAgeOfMaleEmployees(emp)+" years");;
					break;
					
				case 6:
					max=findMaxSalaryOfAnEmployee(emp);
					System.out.println("THE DATA OF EMPLOYEES WITH MAXIMUM SALARY: ");
					System.out.println("\n--------------------------------------------------------------------------------------------------------------\nID\tNAME\tAGE\tSALARY\t\tDESIGNATION\tGENDER\tPERMANENT?\n\n");
					System.out.println(max.getEmpId()+"\t"+max.getName()+"\t"+max.getAge()+"\t"+max.getSalary()+"\t\t"+max.getDesignation()+"\t\t"+max.getGender()+"\t\t"+max.isPermanentEmployeee());
					break;
					
				case 7:
					min=findMinSalaryOfAnEmployee(emp);
					System.out.println("THE DATA OF EMPLOYEES WITH MAXIMUM SALARY: ");
					System.out.println("\n--------------------------------------------------------------------------------------------------------------\nID\tNAME\tAGE\tSALARY\t\tDESIGNATION\tGENDER\tPERMANENT?\n\n");
					System.out.println(min.getEmpId()+"\t"+min.getName()+"\t"+min.getAge()+"\t"+min.getSalary()+"\t\t"+min.getDesignation()+"\t\t"+min.getGender()+"\t\t"+min.isPermanentEmployeee());
					break;
					
				case 8:
					emp1=sortEmployeeBasedOnAge(emp);
					System.out.println("THE DATA OF EMPLOYEES WITH RESPECT TO AGE SORTED IN ASCENDING ORDER: ");
					System.out.println("\n--------------------------------------------------------------------------------------------------------------\nID\tNAME\tAGE\tSALARY\t\tDESIGNATION\tGENDER\tPERMANENT?\n\n");
					for(int i=0;i<emp1.length;i++)
						System.out.println(emp1[i].getEmpId()+"\t"+emp1[i].getName()+"\t"+emp1[i].getAge()+"\t"+emp1[i].getSalary()+"\t\t"+emp1[i].getDesignation()+"\t\t"+emp1[i].getGender()+"\t\t"+emp1[i].isPermanentEmployeee());
					break;
				
				case 9:
					System.out.print("Enter the designation: ");
					designation=sc.next();
					emp1=searchEmployeeWithDesignation(emp,designation);
					if(emp1==null)
						System.out.println("NO EMPLOYEES WITH GIVEN DESIGNATION IS FOUND.");
					else {
						System.out.println("THE DATA OF EMPLOYEES WITH THE GIVEN DESIGNATION IS: ");
						System.out.println("\n--------------------------------------------------------------------------------------------------------------\nID\tNAME\tAGE\tSALARY\t\tDESIGNATION\tGENDER\tPERMANENT?\n\n");
						for(int i=0;i<emp1.length;i++)
							System.out.println(emp1[i].getEmpId()+"\t"+emp1[i].getName()+"\t"+emp1[i].getAge()+"\t"+emp1[i].getSalary()+"\t\t"+emp1[i].getDesignation()+"\t\t"+emp1[i].getGender()+"\t\t"+emp1[i].isPermanentEmployeee());
					}
					break;
				
				case 10:
					emp1=getDetailsOfAnEmployee(emp);
					if(emp1==null)
						System.out.println("NO EMPLOYEES WITH GIVEN CONDITIONS IS FOUND.");
					else {
						System.out.println("THE DATA OF EMPLOYEES WITH SALARY GREATER THAN 25000 AND IS A PERMANENT EMPLOYEE: ");
						System.out.println("\n--------------------------------------------------------------------------------------------------------------\nID\tNAME\tAGE\tSALARY\t\tDESIGNATION\tGENDER\tPERMANENT?\n\n");
						for(int i=0;i<emp1.length;i++)
							System.out.println(emp1[i].getEmpId()+"\t"+emp1[i].getName()+"\t"+emp1[i].getAge()+"\t"+emp1[i].getSalary()+"\t\t"+emp1[i].getDesignation()+"\t\t"+emp1[i].getGender()+"\t\t"+emp1[i].isPermanentEmployeee());
					}
					break;
				
				case 11:
					System.out.print("Enter the designation: ");
					designation=sc.next();
					emp1=searchEmployeeWithDesignationSortedById(emp, designation);
					if(emp1==null)
						System.out.println("NO EMPLOYEES WITH GIVEN DESIGNATION IS FOUND.");
					else {
						System.out.println("THE DATA OF EMPLOYEES WITH THE GIVEN DESIGNATION SORTED BY THEIR ID: ");
						System.out.println("\n--------------------------------------------------------------------------------------------------------------\nID\tNAME\tAGE\tSALARY\t\tDESIGNATION\tGENDER\tPERMANENT?\n\n");
						for(int i=0;i<emp1.length;i++)
							System.out.println(emp1[i].getEmpId()+"\t"+emp1[i].getName()+"\t"+emp1[i].getAge()+"\t"+emp1[i].getSalary()+"\t\t"+emp1[i].getDesignation()+"\t\t"+emp1[i].getGender()+"\t\t"+emp1[i].isPermanentEmployeee());
					}
					break;
				
				case 12:
					emp1=findEmployeesMoreThanAverageAge(emp);
					System.out.println("THE DATA OF EMPLOYEES HAVING AGE GREATER THAN THE AVERAGE AGE: ");
					System.out.println("\n--------------------------------------------------------------------------------------------------------------\nID\tNAME\tAGE\tSALARY\t\tDESIGNATION\tGENDER\tPERMANENT?\n\n");
					for(int i=0;i<emp1.length;i++)
						System.out.println(emp1[i].getEmpId()+"\t"+emp1[i].getName()+"\t"+emp1[i].getAge()+"\t"+emp1[i].getSalary()+"\t\t"+emp1[i].getDesignation()+"\t\t"+emp1[i].getGender()+"\t\t"+emp1[i].isPermanentEmployeee());
					break;
				
				case 13:
					System.exit(1);
				
				default:
					System.out.println("Wrong Choice.....!!!");
			}
		}
	}

}

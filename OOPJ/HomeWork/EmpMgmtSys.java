/*

Employee Management System

*/

import java.util.Scanner;

class Employee{
	int empId;
	String empName;
	double empSalary;
	String empAddr;
	long empPhone;
	
	static int count = 0;
	
	Employee(){
		this.empId = 0;
		this.empName = "name";
		this.empSalary = 0.0; 
		this.empAddr = "addr"; 
		this.empPhone = 91;
	}
	
	void insertData(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID: ");
		//emps[Employee.count].empId = sc.nextInt();
		this.empId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name: ");
		//emps[Employee.count].empName = sc.nextInt();
		this.empName = sc.nextLine();
		
		System.out.println("Enter salary: ");
		//emps[Employee.count].empSalary = sc.nextInt();
		this.empSalary = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter address: ");
		//emps[Employee.count].empAddr = sc.nextInt();
		this.empAddr = sc.nextLine();
		
		System.out.println("Enter phone: ");
		//emps[Employee.count].empPhone = sc.nextInt();
		this.empPhone = sc.nextLong();
		Employee.count++;
		
		System.out.println("Value of count: " + Employee.count);
		System.out.println("Data entered successfully!");
		
	}
	
	void printDetails(Employee e){	
		System.out.println("ID: "+ e.empId);
		System.out.println("Name: "+ e.empName);
		System.out.println("Salary: "+ e.empSalary);
		System.out.println("Address: "+ e.empAddr);
		System.out.println("Phone: "+ e.empPhone);
		
	}
	
}


class EmpMgmtSys{
	public static void main(String args[]){
		
		Employee[] emps = new Employee[15];
		
		for(int i=0; i<15; i++){
			emps[i] = new Employee();
		}
		
		Scanner sc = new Scanner(System.in);
		
		boolean running = true;
		
		while(running){
			
			System.out.println("Enter 1 : to insert the data");
			System.out.println("Enter 2 : to print the data");
			System.out.println("Enter 3 : to exit");
			
			
			int choice = sc.nextInt();
			
			switch(choice){
				
				case 3 : System.exit(0);
				
				case 1 : if(Employee.count>=15){
							System.out.println("List full!");
						}
						else{
							emps[Employee.count].insertData();
							
						}
						break;
						
				case 2 : 	if(Employee.count == 0){
							System.out.println("The list is empty, please enter some details!");
							}
				
							else{
								System.out.println("Enter employee ID to fetch details");
								int optEmpID = sc.nextInt();
								
								int flagCheck = 0;
								for(int i = 0; i<Employee.count; i++){           // instead of iterating the whole array, we iterate upto the count(inserted values)
									if(optEmpID == emps[i].empId){
										emps[i].printDetails(emps[i]);
										flagCheck = 1;
										break;              // necessary to avoid traversal if ID found in intial findings
									}
								}
								
								if(flagCheck == 0){
									System.out.println("Details not found!");
								}
							}
							break;
							
				default : System.out.println("Please enter valid inputs!");
							
				
							
			}
		}
		
	}
	
}
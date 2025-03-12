
/*

Employee (default and parameterised constructor)

*/


import java.util.Scanner;


class Employee{
	
	int empID;
	String empName;
	
	
	
	
	
	Employee(){
		empID = 0;
		System.out.println(empID);
	
	}
	
	
	Employee(int n, String name){
		empID = n;
		empName = name;
	}
	
	void showDetails(){
		
		System.out.println(this.empID+ " "+this.empName); 
		
	}
	
	Employee(Employee e){
		this.empID = e.empID;
		this.empName = e.empName;
		
	}
	
	

}

class Practice_2{
	public static void main(String args[]){
	
		//Employee e1 = new Employee();
		
		Employee e2 = new Employee();
		
		//Employee e3 = new Employee(123, "Sanket");
		
		//System.out.println(e3.empID + " " + e3.empName);
		
		//e3.showDetails();
		
		e2.empID = 456;
		e2.empName = "Sarang";
		
		e2.showDetails();
		
		Employee eCopy = new Employee(e2);
		eCopy.showDetails();
	
	
	
		
		
	}
}

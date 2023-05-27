package com.edu;    
import com.eduP1.EmployeeId;


public class MainApp extends EmployeeId{
	
	void displayEmployeeDetails() {
		System.out.println("Name="+ename);
		String salary = null;
		System.out.println("salary="+salary); //protected data can be accessed
		//System.out.println("eid="+eid); //private
	}

	public static void main(String[] args) {
		EmployeeId employee=new EmployeeId();
		//System.out.println("Employee id="+employee.eid);//private
		System.out.println("Name="+employee.ename);
		
		MainApp mainapp=new MainApp();
		mainapp.displayEmployeeDetails();
		

	}

}
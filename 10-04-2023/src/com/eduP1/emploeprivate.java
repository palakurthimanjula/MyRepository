package com.eduP1;   //package(1)
//import(2)
 //class(3)

import com.edu.p2.Employee;

//class Employee{
//private int eid;
//protected String ename;
//Employee(){
//eid=12;
//ename="Kiran";
//}
//}
public class emploeprivate extends Employee{

void displayEmployeeDetails() {
System.out.println("Name="+ename);
System.out.println("salary="+salary); //protected data can be accessed
//System.out.println("eid="+eid); //private
}

public static void main(String[] args) {
Employee employee=new Employee();
//System.out.println("Employee id="+employee.eid);//private
System.out.println("Name="+employee.ename);

emploeprivate mainapp=new emploeprivate();
mainapp.displayEmployeeDetails();


}

}


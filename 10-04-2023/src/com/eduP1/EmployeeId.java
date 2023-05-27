package com.eduP1;

public class EmployeeId{
	private int eid;  //within class
    public String ename; //within package,another package with the object ref, extended class 
	protected float salary; //with in package it behaves like a public
	                        //another package only extended class can access
	public EmployeeId(){
		eid=12;
		ename="Kiran";
		salary=98763;
	}
}

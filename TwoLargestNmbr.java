package com.edu;
@FunctionalInterface
interface Myinterface{
//only one abstract method in functional interface
void meth1();

 default void meth2(){
	System.out.println("default method");
}
default void meth4(){
	System.out.println("default method");
}
static void method3(){
	 System.out.println("static method");
}
}
public class TwoLargestNmbr {
 int a;
	public static void main(String[] args) {
		
		//Lambda Exp
		
		Myinterface obj=()->{
			System.out.println("This is abstract method");
		};
		obj.meth1();
		obj.meth2();
		Myinterface.method3();
	}
}



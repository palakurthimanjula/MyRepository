package com.edu;
public class MainStaticApp {
	   int accno;
	   static String bankname;
	   static {
		   bankname="HDFC"; 
	   }
	   MainStaticApp(){
		accno=8765;
	   }
		void nonStaticMethod() {
			System.out.println("Non static method");
			System.out.println("Bank name="+bankname);
			System.out.println("Accno="+accno);
		}
		static void display() {
			System.out.println("static display method");
			System.out.println("Bank name="+bankname);
			//System.out.println("Accno="+accno);
		}
		public static void main(String[] args) {
			MainStaticApp mainstaticapp=new MainStaticApp();
			 display();
			 MainStaticApp.display();
			 mainstaticapp.display();
			 mainstaticapp.nonStaticMethod();
	         
		}

	}


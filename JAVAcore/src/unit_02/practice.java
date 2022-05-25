package unit_02;
/*
 * runtime polymorphism another name is dynamic method dispatch {DMD}
 * 
 * it is resolved by JVM
 * 
 * 
 * UNICODE -: 16 bit charecter encoding capable of representing almost every language known.
 * Architectural neutral: java have a fixed memory for all data types.
 * */

import java.util.Scanner;
import java.util.*;
class student{
	int age;
	int percentage;
	String name;
	student(){
		System.out.println("default");
	}
	student(int per,int a, String nam){
		percentage=per;
		
		age=a;
		
		name=nam;
	}
}
public class practice {
	public static void main(String[] args) {
		int per;
		int age;
		String name;
	 
	
		
		student[] data =new student[8];
		
		data[0]= new student(80,34,"yash");
		
		
	System.out.println("Enter student details\n");
	Scanner obj= new Scanner(System.in);
	Scanner obj2= new Scanner(System.in);
	
	
		System.out.println("\npercentage: ");
		per = obj.nextInt();
		System.out.println("\nage: ");
		age = obj.nextInt();
		System.out.println("\nname: ");
		name = obj2.nextLine();
		student arr1= new student(per,age,name);	
		
		System.out.println("\npercentage: ");
		per = obj.nextInt();
		System.out.println("\nage: ");
		age = obj.nextInt();
		System.out.println("\nname: ");
		name = obj2.nextLine();
		student arr2= new student(per,age,name);
		
		System.out.println("\npercentage: ");
		per = obj.nextInt();
		System.out.println("\nage: ");
		age = obj.nextInt();
		System.out.println("\nname: ");
		name = obj2.nextLine();
		student arr3= new student(per,age,name);
		
		System.out.println("\npercentage: ");
		per = obj.nextInt();
		System.out.println("\nage: ");
		age = obj.nextInt();
		System.out.println("\nname: ");
		name = obj2.nextLine();
		student arr4= new student(per,age,name);
		
		System.out.println("\npercentage: ");
		per = obj.nextInt();
		System.out.println("\nage: ");
		age = obj.nextInt();
		System.out.println("\nname: ");
		name = obj2.nextLine();
		student arr5= new student(per,age,name);
		
		System.out.println("\npercentage: ");
		per = obj.nextInt();
		System.out.println("\nage: ");
		age = obj.nextInt();
		System.out.println("\nname: ");
		name = obj2.nextLine();
		student arr6= new student(per,age,name);
		
		
	
	int avg = (arr1.percentage+ arr2.percentage + arr3.percentage + arr4.percentage+ arr5.percentage + arr6.percentage)/6;
	
	System.out.print(avg);
	}

	private static student student(int i, int j, String string) {
		// TODO Auto-generated method stub
		return null;
	}
}

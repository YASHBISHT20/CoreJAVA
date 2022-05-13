package UNIT_03;
import java.util.*;
/*some exception can not be determined during compile time, only when we run the code them only we will get to 
know if the exception has occurred or not, but definitely.we could have written a handle to catch those exceptions.*/
//exception are caught during runtime.
//syntax error is caught by the compiler.
//when we compile a java code the compiler is responsible for findinig out the syntactic and symantic issues in the code.


/*
 * P14_exceptionHandling.java
 * 1-obj.basicException(){/by zero}
 * 2-obj.handleException
 * */
public class P14_ExceptionHandling{

	public static void main(String[] args) {
		
		ABCDE nam= new ABCDE();
		//name.inputMismatchException();
		//name.stackOverFlowError(10);
		//name.indexOutOfBoundsException();
		//name.nullPointerException();
		//name.basicException();
		//name.multipleCatch();

	}

	class ABCDE{
		//java.util.InputMismatchException
		
		void inputMismatchException() {
			try {
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter a number");
		int a =obj.nextInt();
		
		System.out.println("number entered: " + a);
		}
			catch(InputMismatchException e) {
				System.out.println("Input mismatch exception");
			}
		
		}
		
		void stackOverFlowError(int a) {
			try{int a = 1;
			while(a>0) {
				a++;
			}}catch(Exception e) {
				System.out.println(e.getMessage());
//				rest of the code!
				System.out.println("Done!");
			}
		}
		
		void basicException() {
			//compiler can not  catch this exception at compile time.
			int b=0;
			int a=100/0;
			System.out.println(a);
		}
		
		
		void handleException() {
			try {
				int b=0;
				int a=100/0;
				System.out.println(a);
				
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
//			rest of the code!
			System.out.println("Done!");
		}
		
		void multipleCatch() {
			
			try {
				int b=0;
				int a=100/0;
				System.out.println(a);
//				child class comes before super class exception
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		void indexOutOfBoundException() {
			try{int[] array = {1,2,3};
			System.out.println(array[4]);}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		void nullPointerException() {}
		void useOfThrow() {}
		void useOfThrows_And_Finally() {}
	}
	
	
	
}


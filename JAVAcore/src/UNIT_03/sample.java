package UNIT_03;

//finally would run anyway


import java.io.IOException;
import java.util.InputMismatchException;

public class sample {

	public static void main(String[] args) {
		try {
			int a = 100/0;
			System.out.println("pritn value of a");
		}catch (InputMismatchException e){
			
			System.out.println("Arithmetic ");
		}
//       catch (Exception e){
//			
//			System.out.println("General exception );
//		}
		finally{      // if there is no exception still finally would always run 
		System.out.println("done");
		}
	}
//if there is exception in try block and there is no appropriate  catch block still finally would run  
}
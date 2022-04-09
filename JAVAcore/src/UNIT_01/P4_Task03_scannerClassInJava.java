package UNIT_01;

import java.util.Scanner;

/*When user takes input from the console!
 * 
 * nextLine()     Read user input [to read Strings]
 * next()         Read next token from the input entered by the user
 * 
 * nextBoolean()  Reads a boolean value from the user
 * nextByte()     Reads a byte value from the user
 * nextDouble()  Reads a double value from the user
 * nextFloat()  Reads a float value from the user
 * nextInt()  Reads a int value from the user
 * nextLine()  Reads a string value from the user
 * nextLong()  Reads a long value from the user
 * nextShort()  Reads a short value from the user
 * 
 */

public class P4_Task03_scannerClassInJava {

	public static void main(String[] args) {
		Scanner myObj1 =new Scanner(System.in); //create a scanner object
		Scanner myObj2 =new Scanner(System.in);
		
		//Read the first Token:(_ space bar)
		String firstName= myObj1.next();
		System.out.println("name is : " + firstName +"\n");
		
		String name= myObj2.nextLine();//(\n)
		String name2 = myObj2.nextLine();//(\n)
		
		System.out.println("Name is: " + name + "\n");
		System.out.println("Name is: " + name2 + "\n");
		
		boolean b = myObj2.nextBoolean();
		System.out.println(b + "\n");
		
		myObj1.close();
		myObj1.close();

	}

}

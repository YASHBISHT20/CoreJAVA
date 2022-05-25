package UNIT_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class P15_FileHandling {

	public static void main(String[] args) {
		FileHandlingInJava obj = new FileHandlingInJava();
		obj.takeInputFromAFileNotFromConsole() ;
	//	obj.saveOutputIntoFile();
	//	obj.createALogFile();

	}
	
}

class FileHandlingInJava{
	void takeInputFromAFileNotFromConsole() throws IOException {
		String path = "C:\\Users\\ASUS\\git\\CoreJAVA\\JAVAcore\\src\\UNIT_03\\input.txt";
		File file = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		while((st = br.readLine()) != null) {
			System.out.println(st);
		}
		if(br.readLine()==null)
			System.out.println("Yes!");
		
//		List that holds strings of a file
		List<String> listOfString = new ArrayList<String>();
		
		//read entire line as string
		String line =br.readLine();
		
		while(line!=null) {
			listOfString.add(line);
			line=br.readLine();
			}
		for(String str: listOfString) {
			System.out.println(str);
		}
		System.out.println("\n");
		br.close();
	}
	
	
	
	void saveOutputIntoFile() throws IOException{
		FileWriter myObj = null;
		try {
			myObj = new FileWriter("output.txt",false);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		BufferedWriter f_writer = new BufferedWriter(myObj);
		
		String text ="this is output file";
		
		f_writer.write(text);
		f_writer.close();
    }
	void createALogFile() {
		a++;
		LocalTime ltime =java.time.LocalTime.now();
		LocalDate ldate =java.time.LocalDate.now();
		FileWriter myObj = null;
		
		try {
			myObj =new FileWriter("log.txt",true);
			
		}catch(IOException e)
		
	}

}
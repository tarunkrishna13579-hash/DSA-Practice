package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * this BufferedReader is used to read the files.
 */


public class Main {
	public static void main(String args[]) {
		
		String path="C:\\Users\\tarun\\Desktop\\New folder\\newfile.txt";
		try(BufferedReader reader=new BufferedReader(new FileReader(path))){
			
			String line;
			while((line=reader.readLine())!=null) { 	//reader.readLine() is used to read the each line of the file
				System.out.println(line);
			}
		}
			catch(Exception e) {
			System.out.println("Got the exception");
		}
	}

}

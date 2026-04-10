package FileWriter;

import java.io.FileWriter;

/*
 * by using this FileWriter we can create a file anywhere we want by specifying the path.
 */

public class Main {

	public static void main(String[] args) {
		String path="C:\\Users\\tarun\\Desktop\\New folder\\newfile.txt";
		
		try(FileWriter file=new FileWriter(path)){
			file.write("hello I'm newly created"); 		//write is used to to write the content inside file
			System.out.println("file has been created");
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		
	}

}

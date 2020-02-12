package jtm.activity10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

public class MyFile {

    public static void copyFile(String filePath){
    	File origFile = new File (filePath, "abc.txt");
    	System.out.println(origFile.getAbsolutePath());
    	String newFileName = origFile.getName()+ "_backup";
    	File copyFile = new File(filePath, newFileName);
    	
    	
    	try {
    	      BufferedReader in = new BufferedReader(new FileReader(origFile));
    	      PrintWriter out = new PrintWriter(new FileWriter(origFile));
    	      String s = in.readLine(); // read line
    	      while ( s != null ) { // print on console
    	        out.print(copyFile);;
    	      }
    	      in.close(); // close reader
    	      out.close();
    	    } catch (IOException e) {
    	      e.printStackTrace(); // handle exceptions
    	    }
    }

	

	public static void main(String[] args) {
		File myFile = new File ("activityFile.txt");
//		System.out.println(myFile.exists());
//		
//		String filePath = myFile.getParent();
//
//    	String newFileName = myFile.getName()+ "_buckup";
//    	File copyFile = new File(filePath, newFileName);
//    	System.out.println(copyFile.getAbsolutePath());
		copyFile(myFile.getParent());
	}

}

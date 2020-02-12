package jtm.activity10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileCopy {

    /*
        TODO
        Implement method that takes path to file as a parameter
        And copies whole contents of the file to the same location
        but with a new file name: <old_file_name>_backup e.g.
        if file is data.txt copy should be named data.txt_backup
     */
    public void copyFile(String filePath){
    	File origFile = new File (filePath);
    	System.out.println(origFile.getAbsolutePath());
  	filePath = origFile.getParent();
  	
    	String newFileName = filePath +"/"+ origFile.getName() + "_backup";
    	File copyFile = new File(newFileName);
    	System.out.println(copyFile.getAbsolutePath());
    	
//        try {
//            // create buffered reader
//            BufferedReader in = new BufferedReader(new FileReader(origFile.getAbsoluteFile()));
//            String s = in.readLine(); // read line
//            while ( s != null ) { // print on console
//              System.out.println("Read: " + s);
//              s = in.readLine();
//            }
//            in.close(); // close reader
//          } catch (IOException e) {
//            e.printStackTrace(); // handle exceptions
//          }
//    	
    	
    	
    	
    	try {
    	      BufferedReader in = new BufferedReader(new FileReader(origFile.getAbsoluteFile()));
    	      PrintWriter out = new PrintWriter(new FileWriter(copyFile.getAbsoluteFile()));
    	      String s = in.readLine(); // read line
    	      while ( s != null ) { // print on console
    	        out.println(s);
    	        s = in.readLine();
    	      }
    	      in.close(); // close reader
    	      out.close();
    	    } catch (IOException e) {
    	      e.printStackTrace(); // handle exceptions
    	    }
    }

}

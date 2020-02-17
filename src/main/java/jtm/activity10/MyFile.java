package jtm.activity10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Date;

public class MyFile {

    

	

	public static void main(String[] args) {
		Date d1 = new Date(1985, 10, 11);
		Date d2 = new Date(1997, 8, 1);
		System.out.println(d1);
		System.out.println(d2);
		int i = d1.compareTo(d2);
		System.out.println(i);
		
		
	}

}

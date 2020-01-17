package JavaProgramsPackage;
import java.io.*;
import java.util.*;
import java.text.*;
import java.io.FileReader;
import java.io.BufferedReader;



public class FR {

	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("C:\\Users\\rsambari\\Desktop\\New (2).txt");
		BufferedReader br = new BufferedReader(fr);
		String ftext = "";
		String text=br.readLine();
		
		while(text != null) {
		ftext += text;
	
		text=br.readLine();
		//System.out.println();
		}
		
		System.out.println(ftext +" ");
		br.close();

	}

}

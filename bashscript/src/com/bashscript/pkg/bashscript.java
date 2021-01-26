package com.bashscript.pkg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class bashscript {
	public static void main(String[] args) throws ClassNotFoundException {
		  Process p;
		  Class.forName("bashscript");
		  try {

		   String[] cmd = {"sh","arithmetic.sh"}; 

		   p = Runtime.getRuntime().exec(cmd); 
		   p.waitFor(); 
		   BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
		   String line; 
		   while((line = reader.readLine())!= null) { 
		    System.out.println(line);
		   } 
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  } catch (InterruptedException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  } 		   
		  
	}


}

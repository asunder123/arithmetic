package com.bashscript.pkg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class bashscript {
	public static void main(String[] args) throws ClassNotFoundException {
		  Process p;
		  Class.forName("bashscript");
		  try {
<<<<<<< HEAD:bashscript/src/com/bashscript/pkg/Bashscript.java
		   String[] cmd = {"sh","arithmetic.sh"};
=======
		   String[] cmd = {"sh","arithmetic.sh"}; 
>>>>>>> bf4e377979eda7047a14a84b158a83d5f59c4320:bashscript/src/com/bashscript/pkg/bashscript.java
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

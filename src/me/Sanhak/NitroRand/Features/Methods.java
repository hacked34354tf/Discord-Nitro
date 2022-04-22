package me.Sanhak.NitroRand.Features;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Methods 
{//start


	public static void Manually() 
	{
	try (Scanner os = new Scanner(System.in)) {
		System.out.println("How many letters and numbers in the codes do you want, for example 17, 16 or 24 Example:766f2W345sF011G2");
		int nu;
		nu = os.nextInt();
		System.out.println("How many codes do you want to print as 3 codes are automatically printed ?!");
		int total;
		total = os.nextInt();
		for (int x = 0 ; x < total ;x++)
		{
		System.out.println(Genertors.Gen1(nu));
		System.out.println(Genertors.Gen2(nu));
		System.out.println(Genertors.Gen3(nu));
		}
	}
	}
	
	
	 public static void Automatically() 
	   {
	     try {
	    	 
	       try (Scanner os = new Scanner(System.in)) {
			System.out.println("How many letters and numbers in the codes do you want, for example 17, 16 or 24 Example:766f2W345sF011G2");
			   int nu;
			   nu = os.nextInt();
			   FileWriter myWriter = new FileWriter(Genertors.name()+".txt");	    	    	  
			   for (int x = 0 ; x < 315 ;x++)
			   {
			   myWriter.write(Genertors.Gen1(nu)+"\n");
			   myWriter.write(Genertors.Gen2(nu)+"\n");
			   myWriter.write(Genertors.Gen3(nu)+"\n");
			   }
			   myWriter.close();
		}
	       System.out.println("The file has been created successfully, you can find it in the location of the code...!!!");
	     } catch (IOException e) {
	       System.out.println("An error occurred.");
	       e.printStackTrace();
	     }
	   }
	
	
}//End

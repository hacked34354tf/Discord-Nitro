package me.Sanhak.NitroRand.Features;

import java.util.*;

public class Main 
{//Start
	
	
public static void main(String[] args) 
{
	System.out.println("―――――――――――――――――――――――――――――――――――――――");
	System.out.println("[INFO] MOST CODES DO NOT WORK!");
	System.out.println("[INFO] GOOD LUCK ..!");
	System.out.println("[INFO] DISCORD : Sanhak#5335");
	System.out.println("  ");
	System.out.println("[1] AUTO-TXT                 ");
	System.out.println("[2] MANUAL-PRINTED (3*NUMBER)                  ");
	System.out.println("[3] EXIT                              ");
	System.out.println("―――――――――――――――――――――――――――――――――――――――");
    
    try (Scanner os = new Scanner(System.in)) {
		int nu;
		nu = os.nextInt();
		
		if (nu == 1)
		{
		Methods.Automatically();
		} 
		if (nu == 2)
		{
		Methods.Manually();
		} 
		if (nu == 3)
		{
		System.exit(0);
		}
	} 
    
 
}










}//End

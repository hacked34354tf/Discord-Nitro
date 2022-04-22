package me.Sanhak.NitroRand.Features;


import java.util.*;


public class Genertors 
{//Statt

	
	
	
	public static String Gen1(int length) 
	   {
	      String randomString = "https://discord.gift/";
	      char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234567890".toCharArray();
	      Random random = new Random();

	      for(int i = 0; i < length; ++i) {
	         randomString = randomString + chars[random.nextInt(chars.length)];
	      }

	      return randomString;
	   }

	   public static String Gen2(int length) 
	   {
	      String randomString = "https://discord.gift/";
	      char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234567890".toCharArray();
	      Random random = new Random();

	      for(int i = 0; i < length; ++i) {
	         randomString = randomString + chars[random.nextInt(chars.length)];
	      }

	      return randomString;
	   }

	   public static String Gen3(int length)
	   {
	      String randomString = "https://discord.gift/";
	      char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234567890".toCharArray();
	      Random random = new Random();

	      for(int i = 0; i < length; ++i) {
	         randomString = randomString + chars[random.nextInt(chars.length)];
	      }

	      return randomString;
	   }
	
	   public static String name()
	   {
	      String randomString = "File-";
	      int length = 5;
	      char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234567890".toCharArray();
	      Random random = new Random();

	      for(int i = 0; i < length; ++i) {
	         randomString = randomString + chars[random.nextInt(chars.length)];
	      }

	      return randomString;
	   }
	
	
	
	
}//End

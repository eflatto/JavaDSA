package kyu8;

import java.io.*;
import java.util.*;
public class AbbreviateATwoWordName {
	public static void main(String[] args) {
		System.out.println(abbrevName("Edwin Flatto"));
	}
	  public static String abbrevName(String name) {
	    String[]newString = name.split(" ");
	    char ans1 = newString[0].charAt(0);
	    char ans2 = newString[1].charAt(0);
	    String ans = ans1+"."+ans2;
	    return ans.toUpperCase();
	  
	}
}

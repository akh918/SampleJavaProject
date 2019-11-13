package com.semantic.java;

public class SampleProgram01 {

    public static String reverseString(String str){
      String rev = "";
      for(int i=str.length()-1; i>=0; i--){
        rev = rev + str.charAt(i);
      }
      return rev;
    }

    public static void main(String[] args) {
        int a=10;
	    System.out.println("We Are From Developer Team");
	    String empName="Anas Raza";
	    int a=10;

	    Scanner scn = new Scanner(System.in);
      System.out.println("Enter any string");
      String name = scn.nextLine();
      System.out.println("Given String is :: "+name);
      String reverse = SampleProgram01.reverseString(name);
      System.out.println("Reverse String is :: "+reverse);
    }
}

package com.codegym.task.task04.task0409;

public class Solution {
	public static void main(String[] args) {
		 displayClosestToTen(8, 11);
	     displayClosestToTen(7, 14);
	     displayClosestToTen(5,15);
}
	  public static void displayClosestToTen(int a, int b) {
		  if(abs(10-a)<abs(10-b))
				  System.out.println(a);
		  else if(abs(10-a)==abs(10-b))
				  System.out.println(a + " " + b);
		  else 
			  System.out.println(b);
		  			
	    }

	    public static int abs(int a) {
	        if (a < 0) {
	            return -a;
	        } else {
	            return a;
	        }
	    }
}

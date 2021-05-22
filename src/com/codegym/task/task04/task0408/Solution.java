package com.codegym.task.task04.task0408;

public class Solution {
	public static void main(String[] args) {
		Compare(3);
		Compare(6);
		Compare(5);
	}
	public static void Compare(int a)
	{
			if(a<5)
				System.out.println("The number is less than 5");
			if(a==5)
				System.out.println("The number is equal to 5");
			if(a>5)
				System.out.println("The number is greater than 5");
	}
}

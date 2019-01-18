package com;

import java.util.Scanner;

public class Employee
{
     public void callEmployee()
     {
    	 System.out.println("employee has been called....");
    	 m1();
     }
     public void m1()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter number 1");
    	 int x=sc.nextInt();
    	 System.out.println("enter number 2");
    	 int y=sc.nextInt();
    	 sum(x,y);
     }
     public void sum(int x, int y)
     {
    	 int sum=x+y;
    	 System.out.println("sum is "+sum);
     }
}

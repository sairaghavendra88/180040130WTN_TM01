package com.wipro.eb.main;
import java.util.*;
import com.wipro.eb.service.ConnectionService;
public class EBMain {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter previous reading");
	int previousReading=sc.nextInt();
	System.out.println("Enter current reading");
	int currentReading=sc.nextInt();
	System.out.println("Enter type");
	String type=sc.next();
	ConnectionService s=new ConnectionService();
	System.out.println(s.generateBill(currentReading,previousReading,type));
    sc.close();
}
	
}

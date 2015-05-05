package com.bayamp.factorial.factorial;

import org.testng.annotations.Test;
import java.util.Scanner;

public class App 
{
	@Test
public static void test(){
	
	int x, y, temp;
	System.out.println("enter x and y");
	Scanner enter= new Scanner(System.in);
	
	x=enter.nextInt();
	y=enter.nextInt();
	
	temp = x;
	x = y;
	y =temp;

	System.out.println ("+X+\n +y");
	
	
	
	
	
}
	
	
	
}

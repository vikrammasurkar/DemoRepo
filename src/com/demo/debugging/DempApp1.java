package com.demo.debugging;
import java.util.Scanner;
public class DempApp1 {

public void sayHello(String name)
{
		System.out.println("Demo App SayHello()");
		for(int i =0;i<=10;i++)
		{
			System.out.println(name+" "+i);
		}
		
		System.out.println("End Of sayHello(.)");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Message::");
		
		String msg=sc.next();
		
		displayMsg(msg);
	}

	public void displayMsg(String msg)
	{
		System.out.println("Demo App.displayMsg()"+msg);

		System.out.println("Demo App.displayMsg()"+msg);
		
		printNumbers(10);
	}
	
	public void printNumbers(int n)
	{
		System.out.println("DemoApp.printNumber()");
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		System.out.println("END");
	}
	public int  add(int a,int b)
	{
		System.out.println("DemoApp.add()");
		return a+b;
	}
	public int  sub(int a,int b)
	{
		System.out.println("DemoApp.sub()");
		return a-b;
	}
	public static void main(String[] args) {


		DempApp1 app=new DempApp1();
		app.sayHello("Savil Mark");
		app.add(10, 20);
		app.sub(20, 30);

	}

}

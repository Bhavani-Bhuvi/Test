package Test;
import java.util.Scanner;
import java.lang.System;

public class AdditionThread extends Thread {  
public void add()  
{    
System.out.println("Thread started running..");  
}  
public static void main(String[] args) {
// TODO Auto-generated method stub		    
Scanner scan = new Scanner(System.in);
System.out.println("Enter the Number1");
int num1 = scan.nextInt();
System.out.println("Enter the Number2");
int num2 = scan.nextInt();
int sum = num1+num2;
AdditionThread t1 = new  AdditionThread();  
t1.start();
t1.add();
System.out.println("Sum of two numbers is: "+ sum);  
scan.close();

		}  
	}



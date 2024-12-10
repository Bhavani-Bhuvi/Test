package Test;
import java.util.Scanner;
import java.lang.System;
public class Calculator {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter the Number1");
int num1= scan.nextInt();
System.out.println("Enter the Number2");
int num2 = scan.nextInt();
int add= num1+num2;
int sub = num1-num2;
int mul= num1*num2;
float div= num1/num2;
int mod = num1%num2;
System.out.println("Addition:"+add);
System.out.println("Subration:"+sub);
System.out.println("Multiplication:"+mul);
System.out.println("Division:"+div);
System.out.println("Modulus:"+mod);
scan.close();

	}

}

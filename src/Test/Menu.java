package Test;

import java.util.Scanner;
public class Menu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the Besant Technology OMR Branch");
        System.out.println("1. Full Stack Master");
        System.out.println("2. Data Analytics Master Program");
        System.out.println("3. Data Science Master Program");
        System.out.println("4. Cloud Computing Master Program");
        System.out.println("5. Software Testing Master Program");
        System.out.print("Select the Course which you need the details (1-5): ");
        int course = scan.nextInt();
        if (course == 1) {
            System.out.println("1.Java");
            System.out.println("2.Python");
            System.out.println("3.MySQL");
            System.out.println("4.HTML,CSS &Angular J");
         } else if (course == 2) {
        	 System.out.println("1.Big Data");
             System.out.println("2.Linux");
             System.out.println("3.SQL");
             System.out.println("4.Java");        }
         else if (course == 3) {
        	 System.out.println("1.Data Science with Python");
             System.out.println("2.Machine Learning");
             System.out.println("3.SQL");
             System.out.println("4.Tableau");         } 
         else if (course == 4) {
        	 System.out.println("1.Linux");
             System.out.println("2.AWS");
             System.out.println("3.GCP");
             System.out.println("4.DevOPS");  
             System.out.println("5.Python");  

             } else if (course == 5) {
             System.out.println("1.Selenium with Java");
             System.out.println("2.Selenium with Python");
             System.out.println("3.Manual Testing");
             System.out.println("4.Mobile App Testing");  
                
        } else {
            System.out.println("Invalid course");
        }
                scan.close();
    }
}

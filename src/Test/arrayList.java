package Test;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayList  {
  
	 public static void main(String[] args) {
	        ArrayList<String> tasks = new ArrayList<>();
	        
	        Scanner scan = new Scanner(System.in);
	        
	        while (true) {
	            System.out.println("\nTo-Do List ");
	            System.out.println("1. Add Task");
	            System.out.println("2. Remove Tasks");
	            System.out.println("3. List View Task");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            
	            int option = scan.nextInt();
	            scan.nextLine(); 
	            
	            switch (option) {
	                case 1:
	                    System.out.print("Enter the task to add: ");
	                    String task = scan.nextLine();
	                    tasks.add(task);
	                    System.out.println("Task added successfully.");
	                    break;
	                    
	       
	                    
	                case 2:
	                    if (tasks.isEmpty()) {
	                        System.out.println("Your To-Do list is empty.");
	                    } else {
	                        System.out.print("Enter the task number to remove: ");
	                        int taskIndex = scan.nextInt() - 1; // Convert to 0-based index
	                        
	                        if (taskIndex >= 0 && taskIndex < tasks.size()) {
	                            tasks.remove(taskIndex);
	                            System.out.println("Task removed successfully.");
	                        } else {
	                            System.out.println("Invalid task number.");
	                        }
	                    }
	                    break;
	                case 3:
	                    if (tasks.isEmpty()) {
	                        System.out.println("Your To-Do list is empty.");
	                    } else {
	                        System.out.println("\nYour To-Do List:");
	                        for (int i = 0; i < tasks.size(); i++) {
	                            System.out.println((i + 1) + ". " + tasks.get(i));
	                        }
	                    }
	                    break;
	                    
	                case 4:
	                    System.out.println("Goodbye!");
	                    scan.close();
	                    return;
	                    
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	    }
	}
    

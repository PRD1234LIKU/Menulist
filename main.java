
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String task = ""; // Variable to store the task

        System.out.println("To Do List-");
        System.out.println(" ");
        System.out.println("MENU");
        System.out.println(" ");
        System.out.println("1. Add Task");
        System.out.println("2. Edit Task");
        System.out.println("3. Delete Task");
        System.out.println("4. Exit");
        System.out.println("");
        System.out.println("Press any number to get started: ");
        int x = in.nextInt();
        in.nextLine(); // Consume the leftover newline

        while (x > 0) {
            System.out.println(" ");
            System.out.println("Enter your choice: ");
            x = in.nextInt();
            in.nextLine(); // Consume the leftover newline

            if (x == 1) {
                System.out.println("Enter the task to add: ");
                task = in.nextLine(); // Store the added task
                System.out.println("");
                System.out.println("To Do List-");
                System.out.println("Task added - " + task);

            } else if (x == 2) {
                System.out.println("Enter the task to edit: ");
                String editTask = in.nextLine(); // Input task to edit
                if (editTask.equals(task)) { // Compare with the stored task
                    System.out.println("Enter the new task: ");
                    task = in.nextLine(); // Update the task with the new one
                    System.out.println("");
                    System.out.println("To Do List-");
                    System.out.println("");
                    System.out.println("The new task is - " + task);
                    System.out.println("Task Updated");
                } else {
                    System.out.println("Task not found. Input not correct!");
                }
            } else if (x == 3) {
                System.out.println("Enter the task number to delete: ");
                int y = in.nextInt();
                if (y == 1) {
                    task = ""; // Clear the task
                    System.out.println("");
                    System.out.println("To Do List-");
                    System.out.println("No Task found");
                    System.out.println("Task deleted");
                } else {
                    System.out.println("Invalid choice");
                }

            } else if (x == 4) {
                System.out.println("");
                System.out.println("To Do List-");
                System.out.println("Exiting the program");
                System.out.println("Exiting.... Please wait for a while!");
                break;
            } else {
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}

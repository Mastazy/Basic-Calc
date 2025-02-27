import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Advanced obj = new Advanced();
        Scanner sc = new Scanner(System.in);
        
        boolean continueCalc = true;

        while (continueCalc) {
            
            System.out.println("\n=== Simple Calculator ===");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            
            if (choice == 5) {
                continueCalc = false;
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }
            System.out.print("Enter the first number: ");
            int n1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int n2 = sc.nextInt();
            switch (choice) {
                case 1:
                    int sum = obj.add(n1, n2);
                    System.out.println(n1 + " + " + n2 + " = " + sum);
                    break;
                case 2:
                    int diff = obj.sub(n1, n2);
                    System.out.println(n1 + " - " + n2 + " = " + diff);
                    break;
                case 3:
                    int product = obj.multi(n1, n2);
                    System.out.println(n1 + " * " + n2 + " = " + product);
                    break;
                case 4:
                    if (n2 != 0) {
                        int quotient = obj.div(n1, n2);
                        System.out.println(n1 + " / " + n2 + " = " + quotient);
                    } else {
                        System.out.println("Error: Division by zero is undefined.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }

        sc.close();
    }
}

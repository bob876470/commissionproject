import java.util.ArrayList;
import java.util.Scanner;

public class CommissionCalculator {
    private ArrayList<Policy> policies;
    private Scanner input;

    public CommissionCalculator() {
        policies = new ArrayList<>();
        input = new Scanner(System.in);
    }

    public void run() {
        int choice;
        do {
            System.out.println("-----------------------------");
            System.out.println("Welcome to Parkland Insurance");
            System.out.println("-----------------------------");
            System.out.println("Enter any of the following:");
            System.out.println("1) Enter auto insurance policy information");
            System.out.println("2) Enter home insurance policy information");
            System.out.println("3) Enter life insurance policy information");
            System.out.println("4) Print all sales entered");
            System.out.println("5) Quit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addAutoPolicy();
                    break;
                case 2:
                    addHomePolicy();
                    break;
                case 3:
                    addLifePolicy();
                    break;
                case 4:
                    printAllPolicies();
                    break;
                case 5:
                    System.out.println("Thank you for using Parkland Insurance!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    private void addAutoPolicy() {
        System.out.print("Enter policy number: ");
        String num = input.nextLine();
        System.out.print("Enter customer name: ");
        String name = input.nextLine();
        System.out.print("Enter policy amount: ");
        double amount = input.nextDouble();
        input.nextLine();
        System.out.print("Enter vehicle make: ");
        String make = input.nextLine();
        System.out.print("Enter vehicle model: ");
        String model = input.nextLine();

        policies.add(new Auto(num, name, amount, make, model));
    }

    private void addHomePolicy() {
        System.out.print("Enter policy number: ");
        String num = input.nextLine();
        System.out.print("Enter customer name: ");
        String name = input.nextLine();
        System.out.print("Enter policy amount: ");
        double amount = input.nextDouble();
        input.nextLine();
        System.out.print("Enter home address: ");
        String address = input.nextLine();

        policies.add(new Home(num, name, amount, address));
    }

    private void addLifePolicy() {
        System.out.print("Enter policy number: ");
        String num = input.nextLine();
        System.out.print("Enter customer name: ");
        String name = input.nextLine();
        System.out.print("Enter policy amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.nextLine();

        policies.add(new Life(num, name, amount, age));
    }

    private void printAllPolicies() {
        if (policies.isEmpty()) {
            System.out.println("No policies have been entered yet.");
            return;
        }

        for (Policy policy : policies) {
            policy.computeCommission();  // Polymorphic call
            System.out.println(policy);  // Polymorphic toString()
        }
    }
}

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        double amount = 0;
        boolean isRunning = true;

        while(isRunning){
            System.out.println("_________________");
            System.out.println("Banking Program");
            System.out.println("_________________");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("_________________");
            System.out.print("Enter your choice(1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 -> CheckBalance(amount);
                case 2 -> amount += Deposit();
                case 3 -> amount -= Withdraw(amount);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid! Please enter a valid number.");
            }
        }
    }

    static void CheckBalance(double amount){
        System.out.printf("Your Balance is: $% .2f", amount );
        System.out.println(" ");
    }

    static double Deposit() {
        System.out.print("Enter deposit amount: $");
        double balance = scanner.nextDouble();
        if (balance < 0) {
            System.out.println("Invalid! Please enter a positive deposit");
            return 0;
        } else {
            return balance;
        }
    }

    static double Withdraw(double balance) {
        System.out.print("Enter withdraw amount: $");
        double withdraw = scanner.nextDouble();
        if (withdraw<0){
            System.out.println("Number can't be negative");
            return 0;
        } else if (balance < withdraw) {
            System.out.println("Insufficient Balance");
            return 0;
        }
        else {
            return withdraw;
        }

    }
}

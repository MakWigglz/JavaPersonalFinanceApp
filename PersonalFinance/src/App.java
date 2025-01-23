import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Transaction {
    private String description;
    private double amount;
    private boolean isIncome;

    public Transaction(String description, double amount, boolean isIncome) {
        this.description = description;
        this.amount = amount;
        this.isIncome = isIncome;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isIncome() {
        return isIncome;
    }
}

public class App {
    private static List<Transaction> transactions = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\nPersonal Finance App");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTransaction(true);
                    break;
                case 2:
                    addTransaction(false);
                    break;
                case 3:
                    viewBalance();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
        System.out.println("Thank you for using the Personal Finance App!");
    }

<<<<<<< Tabnine <<<<<<<
    /**//+
     * Adds a new transaction to the list of transactions.//+
     * This method prompts the user to enter a description and amount for the transaction,//+
     * then creates a new Transaction object and adds it to the transactions list.//+
     *//+
     * @param isIncome A boolean flag indicating whether the transaction is income (true) or expense (false).//+
     *///+
    private static void addTransaction(boolean isIncome) {
        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        transactions.add(new Transaction(description, amount, isIncome));
        System.out.println(isIncome ? "Income added." : "Expense added.");
    }
>>>>>>> Tabnine >>>>>>>// {"conversationId":"73bfdd5c-c7d9-47c1-a596-64acbb734eb5","source":"instruct"}

    private static void viewBalance() {
        double balance = 0;
        System.out.println("\nTransaction History:");
        for (Transaction t : transactions) {
            System.out.printf("%s: $%.2f (%s)%n", 
                t.getDescription(), t.getAmount(), t.isIncome() ? "Income" : "Expense");
            balance += t.isIncome() ? t.getAmount() : -t.getAmount();
        }
        System.out.printf("\nCurrent Balance: $%.2f%n", balance);
    }
}

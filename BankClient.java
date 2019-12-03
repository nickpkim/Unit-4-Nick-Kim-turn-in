import java.util.Scanner;
public class BankClient{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to George Bank!");
        System.out.println("Create account:");
        System.out.println("name:");
        String initialName = scan.nextLine();
        System.out.println("deposit:");
        double initialDeposit = scan.nextDouble();
        Bank acc = new Bank(96024, initialName, "emailmama@hotmail.com", "joferplat3", initialDeposit);
        System.out.println();
        acc.getAcc();
        System.out.println("Enter \"v\" to view your account\nEnter \"d\" to make a deposit\nEnter \"w\" to make a withdrawal\nEnter \"q\" to exit\n");
        boolean run = true;
        while (run) {
            String action = scan.nextLine();
            if (action.equals("v")) {
                acc.getAcc();
            }
            if (action.equals("d")) {
                System.out.println("deposit:");
                acc.deposit(scan.nextDouble());
            }
            if (action.equals("w")) {
                System.out.println("withdraw:");
                acc.withdraw(scan.nextDouble());
            }
            if (action.equals("q")) {
                run = false;
            }
        }
        System.out.println("Goodbye! *boodwap*");
    }
}

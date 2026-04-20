import java.util.*;

class ATM
{
    private int accountNumber;
    private int balance = 1000;
    private ArrayList<String> history = new ArrayList<>();

    public ATM(int acc)
    {
        accountNumber = acc;
    }

    public void showAccount()
    {
        System.out.println("Account Number: " + accountNumber);
    }

    public void checkBalance()
    {
        System.out.println("Balance: " + balance);
    }

    public void deposit(int amount)
    {
        balance += amount;
        history.add("Deposited: " + amount);
    }

    public void withdraw(int amount)
    {
        if(amount > balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            balance -= amount;
            history.add("Withdrawn: " + amount);
        }
    }

    public void showHistory()
    {
        for(String h : history)
        {
            System.out.println(h);
        }
    }
}

public class ATMProject
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        ATM obj = new ATM(acc);

        int choice;

        do
        {
            System.out.println("\n1.Show Account");
            System.out.println("2.Check Balance");
            System.out.println("3.Deposit");
            System.out.println("4.Withdraw");
            System.out.println("5.History");
            System.out.println("6.Exit");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    obj.showAccount();
                    break;

                case 2:
                    obj.checkBalance();
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    obj.deposit(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter amount: ");
                    obj.withdraw(sc.nextInt());
                    break;

                case 5:
                    obj.showHistory();
                    break;
            }

        }while(choice != 6);
    }
}
import java.util.Scanner;

class InsufficientFundsException extends Exception {

  public InsufficientFundsException(String e) {
    super(e);
  }
}

public class BankAccount {
  Bank[] b = new Bank[100];
  int count = 0;
  Scanner s = new Scanner(System.in);

  public void addAccount() {
    System.out.println("Enter Account number");
    String number = s.next();
    int check = 0;
    for (int i = 0; i < count; i++) {
      if (number.equals(b[i].getAccount_Number())) {
        check = 1;
        System.out.println("Account number is already present");
      }
    }
    if (check == 0) {
      System.out.println("Enter the opening Balance");
      double bal = s.nextDouble();
      Bank obj = new Bank();
      obj.setAccount_Number(number);
      obj.setBalance(bal);
      b[count] = obj;
      count++;

    }
  }

  public void deposit() {
    System.out.println("enter the account_number");
    String acc = s.next();
    int check = 0;
    for (int i = 0; i < count; i++) {
      if (acc.equals(b[i].getAccount_Number())) {
        check = 100;
        double amt = b[i].getBalance();
        System.out.println("enter the balance to deposit");
        double val = s.nextDouble();
        b[i].setBalance(amt + val);
        System.out.println("your updaated balance is " + b[i].getBalance());
      }

    }
    if (check == 0) {
      System.out.println("please enter the valid number");
    }

  }

  public void withdrawl() throws InsufficientFundsException {
    System.out.println("enter the bank account number");
    String acc = s.next();
    for (int i = 0; i < count; i++) {
      if (acc.equals(b[i].getAccount_Number())) {
        System.out.println("enter the amount to withdraw");
        double amount = s.nextDouble();
        if (amount > b[i].getBalance()) {
          throw new InsufficientFundsException("insufficient funds");
        } else {
          double Bal = b[i].getBalance() - amount;
          b[i].setBalance(Bal);
          System.out.println("withdrawl succesful your current balance is " + b[i].getBalance());
        }
      }
    }

  }

  public void check_Balance() {
    System.out.println("enter the account_number");
    String acc = s.next();
    int check = 0;
    for (int i = 0; i < count; i++) {
      if (acc.equals(b[i].getAccount_Number())) {
        check = 1;
        System.out.println("your account balance is " + b[i].getBalance());
      }
    }
    if (check == 0) {
      System.out.println("please enter the correct account number");
    }
  }

  public static void main(String args[]) {
    int option = 0;
    BankAccount BA = new BankAccount();
    do {
      System.out.println("1.Add Account");
      System.out.println("2.Deposit money");
      System.out.println("3.withdraw money");
      System.out.println("4.check balance");
      System.out.println("5.Exit");
      option = BA.s.nextInt();
      if (option == 1) {
        BA.addAccount();
      } else if (option == 2) {
        BA.deposit();
      } else if (option == 3) {
        try {
          BA.withdrawl();
        } catch (InsufficientFundsException e) {
          System.out.println(e);
        }
      } else if (option == 4) {
        BA.check_Balance();
      }

    } while (option != 5);

  }
}
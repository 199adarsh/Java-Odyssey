package exceptions;

import java.util.Scanner;


class NegativeAmountException extends Exception {
  public NegativeAmountException(String message) {super(message);}
}

class InSufficientFundException extends Exception {
  public InSufficientFundException(String message) {super(message);}
}

public class BankAccount {

  static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    Bank[] accounts = new Bank[size];
    int count = 0;

    while (true) {
      System.out.println("\n1. Add Account \n2. Display All  \n3. Deposit  \n4. Withdraw  \n5. Exit");
      int choice = sc.nextInt();

      if (choice == 5) break;

      switch (choice) {
        case 1:
          if (count < size) {
            System.out.print("Enter Account No, User Name, Account Balance, Type(Savings/Current): ");
            accounts[count++] = new Bank(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next());
          }
          else
            System.out.println("Array full.");
          break;

        case 2:
          for (int i = 0; i < count; i++)
            System.out.println(accounts[i]);
          break;

        case 3:
          System.out.print("Enter AccNo and Amount: ");
          int accNoD = sc.nextInt();
          double amtD = sc.nextDouble();

          try {
            for (int i = 0; i < count; i++)
              if (accounts[i].accNo == accNoD)
                  accounts[i].deposit(amtD);

          }
          catch (NegativeAmountException e) {System.out.println(e.getMessage());}
          break;

        case 4:
          System.out.print("Enter AccNo and Amount: ");
          int accNoW = sc.nextInt();
          double amtW = sc.nextDouble();

          try {
            for (int i = 0; i < count; i++)
              if (accounts[i].accNo == accNoW)
                    accounts[i].withdraw(amtW);

          }
          catch (InSufficientFundException e) {
            System.out.println(e.getMessage());
          }
          break;
      }
    }
  }
}

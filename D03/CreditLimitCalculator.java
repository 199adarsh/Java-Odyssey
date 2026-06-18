import java.util.Scanner;

class TestCreditLimitCalculator {
    
    int accountNumber;
    int beginningBalance;
    int charges;
    int credits;
    int creditLimit;
    
    
    public TestCreditLimitCalculator(int accountNumber, int beginningBalance, int charges, int credits, int creditLimit) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.charges = charges;
        this.credits = credits;
        this.creditLimit = creditLimit;
    }
    
    
    void setAccountNumber(int accountNumber) { 
		this.accountNumber = accountNumber; 
	}
    void setBeginningBalance(int beginningBalance) { this.beginningBalance = beginningBalance; }
    void setCharges(int charges) { this.charges = charges; }
    void setCredits(int credits) { this.credits = credits; }
    void setCreditLimit(int creditLimit) { this.creditLimit = creditLimit; }
    
   
    int getAccountNumber() { return accountNumber; }
    int getBeginningBalance() { return beginningBalance; }
    int getCharges() { return charges; }
    int getCredits() { return credits; }
    int getCreditLimit() { return creditLimit; }
    
    public void displayBalance() {
        int newBalance = beginningBalance + charges - credits;
        
        System.out.println("Account Number: " + accountNumber);
        System.out.println("New Balance: " + newBalance);
        
        
        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        } else {
			System.out.println("New Balance : "+newBalance);
            System.out.println("Credit status : "+(creditLimit - credits));
        }
    }
}

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        TestCreditLimitCalculator t = new TestCreditLimitCalculator(105452, 10000, 4500, 1500, 7500);
        
        System.out.println("Current Getters Details ");
        System.out.println("Account Number      : " + t.getAccountNumber());
        System.out.println("Beginning Balance   : " + t.getBeginningBalance());
        System.out.println("Charges             : " + t.getCharges());
        System.out.println("Credits Applied     : " + t.getCredits());
        System.out.println("Allowed Credit Limit: " + t.getCreditLimit());
        
        System.out.println("\nEnter New Values Setters ");
        
        System.out.print("Enter Account Number: ");
        t.setAccountNumber(sc.nextInt());
        
        System.out.print("Enter Beginning Balance: ");
        t.setBeginningBalance(sc.nextInt());
        
        System.out.print("Enter Total Charges This Month: ");
        t.setCharges(sc.nextInt());
        
        System.out.print("Enter Total Credits Applied This Month: ");
        t.setCredits(sc.nextInt());
        
        System.out.print("Enter Allowed Credit Limit: ");
        t.setCreditLimit(sc.nextInt());
        
		System.out.println("\nDisplay Balance :");
        t.displayBalance();
        
        sc.close();
    }
}
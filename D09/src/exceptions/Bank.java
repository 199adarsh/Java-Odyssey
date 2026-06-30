package exceptions;


class Bank {

    int accNo;
    String name, type;
    double balance;

    public Bank(int accNo, String name, double balance, String type) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        this.type = type;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0)
            throw new NegativeAmountException("Deposit amount cannot be negative.");
        balance += amount;
    }

    public void withdraw(double amount) throws InSufficientFundException {
        if (amount < 0 || amount > balance)
            throw new InSufficientFundException(
                    "Invalid withdrawal: Negative amount or insufficient funds.");
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account No: " + accNo + ", Name: " + name + ", Balance: " + balance + ", Type: " + type;
    }
}

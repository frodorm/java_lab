public class BankAccount {
    private String owner;
    private String accountNumber;
    private double balance;

    static int accountsCount = 0;

    public BankAccount(String owner, String accountNumber, double balance) {
        this(owner, accountNumber);
        initializeBalanceResolver(balance);
    }

    public BankAccount(String owner, String accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        ++accountsCount;
    }

    private void initializeBalanceResolver(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Введен некорректный начальный баланс, балансу присвоено значение 0");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void showFullInfo() {
        System.out.println(owner + " | " + accountNumber + " | " + balance);
    }

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Операция выполнена, баланс: " + balance);
        } else {
            System.out.println("Неверный ввод, текущий баланс: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Операция выполнена, баланс: " + balance);
        } else {
            System.out.println("Неверный ввод, текущий баланс: " + balance);
        }
    }
}

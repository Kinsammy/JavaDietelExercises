package chapter3;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Ade Wale", 0.0);
        System.out.printf("The Account is %s and the balance is %.2f%n",account1.getName(), account1.getBalance());
        account1.deposit(5000.0);
        System.out.printf("The Account is %sa nd the balance is %.2f%n",account1.getName(), account1.getBalance());
        account1.withdraw(3000.0);
        System.out.printf("The Account is %s and the balance is %.2f",account1.getName(), account1.getBalance());
    }
}

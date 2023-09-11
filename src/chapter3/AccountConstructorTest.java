package chapter3;

public class AccountConstructorTest {
    public static void main(String[] args) {
        AccountConstructor myAccount = new AccountConstructor("Bayadere Kingsley");
        AccountConstructor myAccount1 = new AccountConstructor("Micheal John");
        System.out.printf("The My Account name is %s%n", myAccount.getName());
        System.out.printf("The My Account1 name is %s", myAccount1.getName());
    }
}

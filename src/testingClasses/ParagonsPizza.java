package testingClasses;

public class ParagonsPizza {
    public int paragons(int pizzaPrice, int currentBalance, int fees) {
        return (pizzaPrice - currentBalance) / fees;
    }
}

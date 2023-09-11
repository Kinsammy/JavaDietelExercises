package leetCode;
// Todo----> You are given an m x n. integer grid accounts where accounts[i][j]
// Todo----> is the amount of money the ith customer has in the jth bank.
// Todo----> Return the wealth that the richest customer has.

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{9,1,6},{3,3,7}};
        int wealth = maximumWealth(accounts);
        System.out.println("The richest customer has: " +wealth);
    }


    public static int maximumWealth(int[][] accounts){
//        int maximumAmount = accounts[0][0];
        int maximumAmount = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int amountInAccount = 0;
            for (int amount = 0; amount < accounts[person].length; amount++) {
                amountInAccount += accounts[person][amount];
            }
            if (amountInAccount > maximumAmount){
                maximumAmount = amountInAccount;
            }

        }
        return maximumAmount;
    }
}

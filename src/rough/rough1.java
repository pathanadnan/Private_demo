package rough;

import java.util.*;

public class rough1 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = coinChange(coins, amount);
        System.out.println(result); // Output: 3 (5 + 5 + 1)
    }

    public static int coinChange(int[] coins, int am) {
        int dp[]=new int[am+1];
        Arrays.fill(dp,am+1);
        dp[0]=0;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<am+1;j++){
                dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }
        if(dp[am]>am) return -1;
        return dp[am];
    }
}

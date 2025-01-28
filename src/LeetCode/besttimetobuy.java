package LeetCode;

public class besttimetobuy {
    public static int maxProfit(int[] prices) {
    //create two pointer
        int left=0;//day we buy
        int right=1;//day we sell
        int maxprofit = 0;
        while (right<prices.length) {
            //profitable
            if (prices[left] > prices[right]) {
                left++;
                right++;
            }
            if (prices[right] > prices[left]) {
                int profit = (prices[right] - prices[left]);
                maxprofit = Math.max(maxprofit,profit);
                right++;
            }
        }
    return maxprofit;
    }

    public static void main(String[] args) {
        int [] prices= {7,6,4,3,1};
                     //         ^ ^
        System.out.println(maxProfit(prices));
    }
}

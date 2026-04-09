class Solution {
    public int maxProfit(int[] prices) {
        int diff=0;
        int len=prices.length; 
        int max=prices[len-1]; 
        int min=prices[0];
        int j=len-1;
        int i=0;
        while(i<=j){

            if(prices[i]<=prices[j]){

                if(min > prices[i])
                min=prices[i];

                if(diff<(prices[i]- min))
                diff = prices[i]- min;

                if(max<prices[j])
                    max= prices[j];
                                    if(diff < (max - prices[i]))
                diff = max - prices[i];

                if(diff<(prices[j]-prices[i])){
                    diff= prices[j]-prices[i];
                }

                j--;

            }

            else{
                if(min > prices[i])
                min=prices[i];

                if(diff<(prices[i]- min))
                diff = prices[i]- min;

                if(max < prices[j])
                max = prices[j];

                if(diff < (max - prices[j]))
                diff = max - prices[j];

                i++;
            }
        }
        return diff;

    }
}

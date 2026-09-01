class Solution {
    public int maxProfit(int[] prices) {

        int buyPrice=Integer.MAX_VALUE;

        int maxProfit=0;

        for(int price:prices){
            if(price<buyPrice){
                buyPrice=price;
            }
            else {
                maxProfit=Math.max(maxProfit,price-buyPrice);
            }
        }

        return maxProfit;

        
    }
}

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = prices[0]
        maxProfit = 0
    
        for i in range(1, len(prices)):
            buy = min(buy, prices[i])
            if(buy < prices[i]):
                currProf = prices[i] - buy
                maxProfit = max(maxProfit, currProf)
        
        return maxProfit
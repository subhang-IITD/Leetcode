class Solution:
    def maxProfit(self, prices: List[int], fee: int) -> int:
        n = len(prices)
        memo = {}

        def dp(i,can_buy):
            if i == n:
                return 0
            if(i,can_buy) in memo:
                return memo[(i,can_buy)]
            if can_buy:
                buy = -prices[i] - fee + dp(i+1,0)
                skip = dp(i+1,1)
                ans = max(buy,skip)
            else:
                sell = prices[i]  + dp(i+1,1)
                skip = dp(i+1,0)
                ans = max(sell,skip)
            
            memo[(i,can_buy)] = ans
            return ans

        return dp(0,1)

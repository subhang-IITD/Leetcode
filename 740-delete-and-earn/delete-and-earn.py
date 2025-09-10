from collections import Counter
class Solution:
    def deleteAndEarn(self, nums: List[int]) -> int:
        count = Counter(nums)
        max_val = max(nums)
        points = [0]*(max_val +1)

        for num , freq in count.items():
            points[num] = num * freq
        
        memo = {}
        def dp(i):
            if i==0:
                return 0
            if i ==1:
                return points[1]
            if i in memo:
                return memo[i]
            memo[i] = max(dp(i-1), dp(i-2) + points[i])
            return memo[i]
        
        return dp(max_val)
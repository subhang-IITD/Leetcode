class Solution:
    def minimumTotal(self, triangle: List[List[int]]) -> int:
        n = len(triangle)
        memo = {}
        def dp(i,j):
            if i==n-1:
                return triangle[i][j]
            
            if (i,j) in memo:
                return memo[(i,j)]
            
            option1 = dp(i+1,j)
            option2 = dp(i+1,j+1)

            memo[(i,j)] = triangle[i][j] + min(option1,option2)
            return memo[(i,j)]
        
        return dp(0,0)

            


class Solution:
    def myPow(self, x: float, n: int) -> float:
        if x == 0:
            return 0
        if n == 0:
            return 1
        if n == 1:
            return x
        
        nn = abs(n)
        ans = 1

        while nn > 0:
            if nn % 2 == 1:  # If nn is odd, multiply ans by x
                ans *= x
                nn-=1
            if nn%2 == 0:
                x *= x  # Square the base
                nn //= 2  # Divide the exponent by 2
        
        if n < 0:
            return 1 / ans
        else:
            return ans
        
        
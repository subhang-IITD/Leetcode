class Solution:
    def getNoZeroIntegers(self, n: int) -> List[int]:

        def zerochecker(n):
            check = False
            while n>0:
                remainder = n%10
                if remainder == 0:
                    check = True
                    break
                n = n//10
            return check
        result = []
        for i in range(1,n):
            if(zerochecker(i) == False and zerochecker(n-i)== False):
                result.append(i)
                result.append(n-i)
                break
        return result

                

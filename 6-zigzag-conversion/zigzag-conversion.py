class Solution:
    def convert(self, s: str, numRows: int) -> str:

        if numRows == 1 or numRows >= len(s):
            return s
        
        counter = 0
        flag = True # true is down flase is up 
        result = [""]*numRows
        for i in range(len(s)):
            result[counter] += s[i]
            if counter == 0:
                flag = True
            if counter == numRows -1:
                flag = False
            if flag is True:
                counter +=1
            else:
                counter -=1
        
        res = ""
        for i in range(len(result)):

            res+= result[i]
        
        return res

            
            

    
        


        

        



            


/*Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Output: true*/
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num >= 2147483647){
            return false;
        }
        
        if(num == 1){
            return true;
        }
        boolean b= true;
        int check=1,i=1;
        
        while(b)
        {
          check=i*i;
            if(check>=num)
            {b=false;}
            i++;
        if(check==num)
            return true ;
        }
            
            return false;
        
    }
}
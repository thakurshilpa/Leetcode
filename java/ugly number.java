/*Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.

Example 1:

Input: 6
Output: true
Explanation: 6 = 2 × 3*/

class Solution {
    
    public boolean isUgly(int num) 
    {
        if(num==0)
        {return false;}
        boolean b=true;
        
        
        
        
      while(num!=1)
      {
          if(num%2==0)
          {num=num/2;}
            else if(num%3==0)
          {num=num/3;}
         else if(num%5==0)
          {num=num/5;}
          else {return false;}
      }
       
        
         return b;
    }
   
}
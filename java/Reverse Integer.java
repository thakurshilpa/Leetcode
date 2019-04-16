/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:
*/
class Solution {
    public int reverse(int x) {
        int sum=0,rem;
        while(x>0)
        {
            rem=x%10;
            sum=(sum*10)+rem;
            x=x/10;
        }
        return sum;
        
    }
}
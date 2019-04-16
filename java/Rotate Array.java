
/*Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]*/

class Solution {
    public void rotate(int[] nums, int k)
    {
        
        for(int i=0;i<k;i++)
        {
           Solution.rotation(nums);
        }
        
    }
        
    
        
    
    public static  int[] rotation(int[] num)
       {
        int t=num[num.length-1];
        for(int i=(num.length-1);i>0;i--)
        {
          num[i]=num[i-1];  
        }
        num[0]=t;
        return num;
        }
  
}
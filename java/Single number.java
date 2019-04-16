/*Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1*/
class Solution {
    public int singleNumber(int[] nums) {
       int p=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
         if(i%2==0)
         {p=nums[i];}
            else if(nums[i]!=p)
            {break;}
        }
        return p;
    }
}
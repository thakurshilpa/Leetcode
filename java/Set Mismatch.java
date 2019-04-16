/*The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, which results in repetition of one number and loss of another number.

Given an array nums representing the data status of this set after the error. Your task is to firstly find the number occurs twice and then find the number that is missing. Return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]*/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int  dp=0,miss=0;
        HashMap<Integer,Integer> hp=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hp.containsKey(nums[i]))
            {
                hp.put(nums[i],hp.get(nums[i])+1);
            }
            else
            {
                hp.put(nums[i],1);
            }
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(hp.containsKey(i))
            {
                if(hp.get(i)==2)
                    dp=i;
            }
            else
            {
                miss=i;
            }
        }
         
      return  new int[]{dp,miss};  
    }
}
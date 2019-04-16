/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true*/
class Solution {
    public boolean isPalindrome(String s) {
    //int j=s.length();
        String p=s.toLowerCase();
        char[] a=p.toCharArray();
        int i=0;
        int j=(a.length)-1;
        while(i<j)
        {
            if(!Character.isLetterOrDigit(a[i])){i++; continue;}
            if(!Character.isLetterOrDigit(a[j])){j--; continue;}
            if(a[i]==a[j])
               {i++;
               j--;}
            else {return false;}
        }
        return true;
        
    }
}
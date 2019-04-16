/*Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:
Input: "aba"
Output: True*/

class Solution {
      public boolean isPalindrome(CharSequence s)
    {
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){return false;}
           
               
         }
              return true;
    }

    public boolean validPalindrome(String s)
    {
        StringBuilder sb =new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            char c=sb.charAt(i);
            sb.deleteCharAt(i);
            if(isPalindrome(sb)) {return true;}
            sb.insert(i,c);
            
        }
        return isPalindrome(s);
        
    }
  

}
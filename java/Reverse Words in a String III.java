/*Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.*/

class Solution {
    public String reverseWords(String s) {
        String[] sp=s.split(" ");
           StringBuilder sh=new StringBuilder();
        for(int i=0;i<sp.length;i++)
        {
            StringBuilder sb=new StringBuilder(sp[i]);
            sb.reverse();
            sh.append(sb);
            sh.append(" ");
            
            
        }
        sh.setLength(sh.length()-1);
      return sh.toString();
        
    }
}
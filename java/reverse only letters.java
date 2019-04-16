/*Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.

 

Example 1:

Input: "ab-cd"
Output: "dc-ba"*/

class Solution {
    public String reverseOnlyLetters(String S) {
        char[] ch=S.toCharArray();
        char temp;
        
        int i=0,j=ch.length-1;
        while(i<j)
        {
            if(Character.isLetter(ch[i])&&Character.isLetter(ch[j]))
            {
                temp=ch[j];
                ch[j]=ch[i];
                ch[i]=temp;
                i++;
                j--;
            }
            if(!Character.isLetter(ch[i]))
            {i++;}
            if(!Character.isLetter(ch[j]))
            {j--;}
        }
        String ret=String.valueOf(ch);
        
        return ret;
        
    }
}
/*Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"*/
class Solution {
    public String reverseVowels(String s) {
        int i=0;
    int    j=s.length()-1;
        char[] a=s.toCharArray();
        while(i<j)
        {
            if(isVowel(a[i])&&isVowel(a[j]))
                                     {
                                         char t=a[j];
                                         a[j]=a[i];
                                         a[i]=t;
                                         i++;
                                         j--;
                                     }
                else if(isVowel(a[i])){j--;}
             else if(isVowel(a[j])){i++;}
            else {i++;j--;}
        }
        return String.valueOf(a);
    }
    public boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
           return true; 
        }
        return false;
    }
}
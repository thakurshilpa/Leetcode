/*Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.*/
class Solution {
    public boolean isAnagram(String s, String t) {
     int p,q;
        p=s.length();
        q=t.length();
        if(p!=q){return false;}
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String str = new String(a);
        String ptr = new String(b);
        int c=str.compareTo(ptr);
        System.out.println(c);
        
       if(c==0)
       {return true;}

        return false;
        
        
        
    }
}
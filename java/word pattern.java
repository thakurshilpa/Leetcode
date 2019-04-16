/*Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true*/
class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        String[] sa=str.split(" ");
        if(pattern.length()!=sa.length){return false;}
        Map<Character,String> m=new HashMap<Character,String>();
        for(int i=0;i<sa.length;i++)
        {
            if(!m.containsKey(pattern.charAt(i))&&!m.containsValue(sa[i]))
            {
                m.put(pattern.charAt(i),sa[i]);
            }
        }
          for(int i=0;i<sa.length;i++)
          {
              if(!sa[i].equals(m.get(pattern.charAt(i))))
              {
                  return false;
              }
          }
        return true;
    }
}
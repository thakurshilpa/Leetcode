/*International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.

Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation: 
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".*/
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        if(words.length==0){return 0;}
        String[] a={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
         int l=words.length;
          HashMap<String,Integer> h=new HashMap<String,Integer>();
        
        String[] s=new String[l];
            for (int i=0;i<words.length;i++)
            {
                char[] b=words[i].toCharArray();
                StringBuilder d=new StringBuilder();
                for( int j=0;j<b.length;j++)
                {
                   d=d.append(a[(b[j]-'a')]); 
                }
                s[i]=d.toString();
                
             
            }
      for(int i=0;i<s.length;i++)
      {
        
          if(h.containsKey(s[i]))
          {
              h.put(s[i],h.get(s[i]+1));
          }
          else
          {
              h.put(s[i],1);
          }
      }
        return h.size();
        
    }
}
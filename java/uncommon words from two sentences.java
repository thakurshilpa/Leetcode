/*We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Return a list of all uncommon words. 

You may return the list in any order.

 

Example 1:

Input: A = "this apple is sweet", B = "this apple is sour"
Output: ["sweet","sour"]*/



class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] a=A.split(" ");
        String[] b=B.split(" ");
       HashMap<String,Integer> h=new HashMap<String,Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(h.containsKey(a[i]))
            {
                h.put(a[i],h.get(a[i])+1);
            }
            else
            {
                h.put(a[i],1);
            }
        }
             for(int i=0;i<b.length;i++)
        {
            if(h.containsKey(b[i]))
            {
                h.put(b[i],h.get(b[i])+1);
            }
            else
            {
                h.put(b[i],1);
            }
        }
                 List<String> l=new LinkedList();
      for (String name : h.keySet()) 
                 {
                     if(h.get(name)==1)
                     {
                         l.add(name);
                     }
                 }
             return l.toArray(new String[l.size()]);
        	//return l.toArray(new String[0]);
                 
                 //return l.toArray(new String[l.size()]);
             // return l.toArray(new String[l.size()]);
    }
}
/*In a deck of cards, each card has an integer written on it.

Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:

Each group has exactly X cards.
All the cards in each group have the same integer.
 

Example 1:

Input: [1,2,3,4,4,3,2,1]
Output: true
Explanation: Possible partition [1,1],[2,2],[3,3],[4,4]*/
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length==1){return false;}
        HashMap<Integer,Integer> hp=new    HashMap<Integer,Integer>();
        for(int i=0;i<deck.length;i++)
        {
            if(hp.containsKey(deck[i]))
            {
                hp.put(deck[i],hp.get(deck[i])+1);
                
            }
            else
            {
                hp.put(deck[i],1);
            }
        }
        if(hp.size()==1){return true;}
        int[] a=new int[hp.size()];
        int k=0;
          for (Integer i : hp.values())  
          {a[k]=i;System.out.println(a[k]);k++;
          }
      Arrays.sort(a);
        int min=a[0];
        if(min==1){return false;}
        for(int i=1;i<a.length;i++)
        {
           int c= gcd(min,a[i]);
            if(c<2) return false;
        }
        return true;
    }
       
        public int gcd(int a,int b){
        {if(a==0) return b;}
        return gcd(b%a,a);}
    }

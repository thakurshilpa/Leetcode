/*There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false.

Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once, "L" will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.

Example 1:

Input: "UD"
Output: true 
Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.*/

class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length()==0||(moves.length())%2!=0){return false;}
        char[] ch=moves.toCharArray();
        HashMap<Character,Integer> hp=new HashMap<Character,Integer>();
        for(int i=0;i<ch.length;i++)
        {
            if(hp.containsKey(ch[i]))
            {
                hp.put(ch[i],hp.get(ch[i])+1);
            }
            else
            {
                hp.put(ch[i],1);
            }
            
        }
        if((hp.size())%2!=0){return false;}
       int p=0,q=0;
        if(hp.containsKey('U'))
        {
         p=hp.get('U');}
         if(hp.containsKey('L'))
         {
         q=hp.get('L');}
        System.out.println(p);
        //for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        for(Map.Entry<Character,Integer> mp : hp.entrySet())
       {
           if(mp.getKey()=='D')
           {
               if(mp.getValue()!=p){  return false;}
           }
           else if(mp.getKey()=='R')
           {
               if(mp.getValue()!=q){  return false;}
           }
       }
        
        return true;
        
    }
}
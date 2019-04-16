?*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true*/
    
    
    
class Solution {
    public boolean isValid(String s) {
        Stack st=new Stack();
        boolean flag=true;
        char []a=s.toCharArray();
        int n=a.length;
       // System.out.println(n);
        
            
      for(int i=0;i<n;i++)
        {
            st.push(a[i]);
    
        }
        for(int i=0;i<n/2;i++)
        {
            Character c=(Character)st.pop();
           // System.out.println(c +  " "+a[i]);
           if((c==')')&&(a[i]=='('))
           
            {flag=true&&flag;}
            
           else   if((c=='}')&&(a[i]=='{'))
                   {flag=true&&flag;}
          else  if((c==']')&&(a[i]=='['))
                   {flag=true&&flag;}
            
            
            else
            {
                flag=false;
            }
            
        
            
        }     
        return flag;
        
    }
}
/*
In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.

If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.

 

Example 1:

Input: N = 2, trust = [[1,2]]
Output: 2
*/


class Solution {
    public int findJudge(int N, int[][] trust) {
        int trusts[]=new int[N];
        if(N==1){return 1;}
        boolean trusteverybody[]=new boolean[N];
          boolean trustnobody[]=new boolean[N];
        Arrays.fill(trustnobody,true);
        for(int i=0;i<trust.length;i++)
        {
            int truster=trust[i][0]-1;
            int trustee=trust[i][1]-1;
            trustnobody[truster]=false;
            int t=++trusts[trustee];
            trusteverybody[trustee]=t>=N-1;
        }
        for(int j=0;j<N;j++)
          
        {  //System.out.println(trusteverybody[j]+ " "+trustnobody[j]);
         if(trusteverybody[j]&&trustnobody[j]) return j+1;
        }
        return -1;
        
    }
}
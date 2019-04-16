/*In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographicaly in this alien language.

 

Example 1:

Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.*/
class Solution {
    
    private boolean isLessThanOrEqualTo(String str1, String str2, Map<Character, Integer> map) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        for(int i=0; i<arr1.length; i++) {
            if(i == arr2.length || (map.get(arr1[i]) > map.get(arr2[i])))  return false;
            if(map.get(arr1[i]) < map.get(arr2[i])) return true;
        }
        
        return true;
    }
    
    public boolean isAlienSorted(String[] words, String order) {
        if(words == null || words.length == 0 || order == null || order.length() == 0) return true;
        
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        
        for(int i=0; i<words.length-1; i++) {
            if(!isLessThanOrEqualTo(words[i], words[i+1], map)) return false;
        }
        
        return true;
    }
}
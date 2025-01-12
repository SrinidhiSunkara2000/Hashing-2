// Time Complexity :O(n) 
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set=new HashSet<Character>();
        int max=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                max+=2;
                set.remove(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }
        if(!set.isEmpty())
            max+=1;
        return max;
        
    }
}
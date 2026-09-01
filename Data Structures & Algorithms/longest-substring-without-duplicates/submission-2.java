class Solution {
    public int lengthOfLongestSubstring(String s) {

        int i=0;
        int maxlength=0;

        HashSet<Character> set = new HashSet<>();

        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            while(set.contains(ch)){
             set.remove(s.charAt(i));
             i++;
            }
          set.add(ch); 
          maxlength=Math.max(maxlength,set.size());
        }

       return maxlength;
        
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        

        int left=0;

        int max=0;

        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);

            while(!set.add(ch)){
                set.remove(s.charAt(left));
                left++;
            }

            max=Math.max(max,right-left+1);
        }

        return max;
    }
}

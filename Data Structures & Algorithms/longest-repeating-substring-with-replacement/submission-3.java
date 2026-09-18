class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character,Integer> map = new HashMap<>();

        int left=0;

        int maxfreq=0;

        int result=0;

        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);

            map.put(ch,map.getOrDefault(ch,0)+1);

            maxfreq=Math.max(maxfreq,map.get(ch));

            while((right-left+1)-maxfreq>k){
               char leftchar = s.charAt(left);
               map.put(leftchar,map.get(leftchar)-1);
               left++;
            }

            result=Math.max(result,right-left+1);
        }

        return result;
    
    }
}

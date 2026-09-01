class Solution {
    public String minWindow(String s, String t) {

      if(t.length()>s.length()){
        return "";
      }
      HashMap<Character,Integer> sMap = new HashMap<>();
      HashMap<Character,Integer> tMap = new HashMap<>();

      for(char c : t.toCharArray()){
        tMap.put(c,tMap.getOrDefault(c,0)+1);
      }

      int left=0;
      int minLength=Integer.MAX_VALUE;
      int start=0;
      int current = 0;
      int required = tMap.size();

      for(int right=0;right<s.length();right++){
        char c= s.charAt(right);
        sMap.put(c,sMap.getOrDefault(c,0)+1);
        if(tMap.containsKey(c) && tMap.get(c).equals(sMap.get(c))){
            current++;
        }
        while(current==required){
            if(right-left+1<minLength){
                minLength=right-left+1;
                start=left;
            }
            char leftChar=s.charAt(left);
            sMap.put(leftChar,sMap.get(leftChar)-1);
            if(tMap.containsKey(leftChar) && sMap.get(leftChar)<tMap.get(leftChar)){
                current--;
            }
            left++;

        }

      }
      if(minLength==Integer.MAX_VALUE){
        return "";
      }
      return s.substring(start,start+minLength);
    }
}

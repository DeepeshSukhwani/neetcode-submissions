class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> map=new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char h: t.toCharArray()){
            if( !map.containsKey(h) || map.get(h)==0){
                return false;
            }
            map.put(h,map.get(h)-1);
        }
        return true;

    }
}

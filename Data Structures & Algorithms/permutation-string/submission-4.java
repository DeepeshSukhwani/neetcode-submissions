class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()){
            return false;
        }

        HashMap<Character,Integer> s1map = new HashMap<>();

        HashMap<Character,Integer> s2map = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            s1map.put(ch1,s1map.getOrDefault(ch1,0)+1);
            s2map.put(ch2,s2map.getOrDefault(ch2,0)+1);
            
        }

        if(s1map.equals(s2map)){
            return true;
        }

        int left=0;

        for(int right=s1.length();right<s2.length();right++){
            char chr=s2.charAt(right);
            char chl=s2.charAt(left);

            s2map.put(chr,s2map.getOrDefault(chr,0)+1);

            s2map.put(chl,s2map.get(chl)-1);

            if(s2map.get(chl)==0){
                s2map.remove(chl);
            }

            left++;

            if(s1map.equals(s2map)){
                return true;
            }
        }

        return false;

    }

}

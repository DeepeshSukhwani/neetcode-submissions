class Solution {
    public boolean isAnagram(String s, String t) {

     HashMap<Character,Integer> map = new HashMap<>();


    if(s.length()!=t.length()){
        return false;
    }
     for(int i=0;i<s.length();i++){
        char schar=s.charAt(i);
        char tchar=t.charAt(i);
        map.put(schar,map.getOrDefault(schar,0)+1);

       map.put(tchar,map.getOrDefault(tchar,0)-1);
     }

     for(int num : map.values()){
        if(num!=0){
            return false;
        }
     }

     return true;

        

    }
}

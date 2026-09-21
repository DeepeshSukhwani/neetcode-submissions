class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()){
            return false;
        }

       char[] s1freq = new char[26];
       char[] s2freq = new char[26];

        HashMap<Character,Integer> s2map = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

           s1freq[ch1-'a']++;
           s2freq[ch2-'a']++;
           

          
            
        }

         if(Arrays.equals(s1freq,s2freq)){
        return true;
       }

      

     int left=0;

        for(int right=s1.length();right<s2.length();right++){
            char chr=s2.charAt(right);
            char chl=s2.charAt(left);

           s2freq[chr-'a']++;
           s2freq[chl-'a']--;

           

            left++;

           if(Arrays.equals(s1freq,s2freq)){
        return true;
       }
        }

        return false;

    }

}

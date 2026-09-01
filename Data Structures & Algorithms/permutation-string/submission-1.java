class Solution {
    public boolean checkInclusion(String s1, String s2) {

         if(s1.length()>s2.length()){
                return false;
            }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        int left=0;
        for(int right=s1.length();right<s2.length();right++){
            if(matches(freq1,freq2)){
                return true;
            }
            freq2[s2.charAt(right)-'a']++;
            freq2[s2.charAt(left)-'a']--;
            left++;
        }
        return matches(freq1,freq2);  
    }
    public boolean matches(int[] arr1, int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

}

class Solution {
    public String minWindow(String s, String t) {

      if(t.length()>s.length()){
        return "";
      }

      HashMap<Character,Integer> smap = new HashMap<>();
      HashMap<Character,Integer> tmap = new HashMap<>();

      for(int i=0;i<t.length();i++){
        char ch= t.charAt(i);
        tmap.put(ch,tmap.getOrDefault(ch,0)+1);
      }

      int left=0;
      int required= tmap.size();
      int current =0;
      int min=Integer.MAX_VALUE;
      int result[] = new int[3];

      for(int right=0;right<s.length();right++){

        char ch= s.charAt(right);

        if(tmap.containsKey(ch)){
          smap.put(ch,smap.getOrDefault(ch,0)+1);
          if(tmap.get(ch).equals(smap.get(ch))){
            current++;
          }
        }

       
          while(current==required){
            if(right-left+1<min){
            min=right-left+1;
            result=new int[]{min,left,right};
            }
            char chl=s.charAt(left);
            if(smap.containsKey(chl)){
              smap.put(chl,smap.get(chl)-1);
              if(smap.get(chl) < tmap.get(chl)){
                current--;
              }
              
            }
          left++;
        

      }

    }
    int l=result[1];
      int r=result[2];
      String substr= s.substring(l,r+1);

      if(min == Integer.MAX_VALUE){
    return "";
}


    return substr;

    }
}


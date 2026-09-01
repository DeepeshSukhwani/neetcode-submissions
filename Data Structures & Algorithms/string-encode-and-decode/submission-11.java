class Solution {

    public String encode(List<String> strs) {
      StringBuilder strbld = new StringBuilder();
      for(String str : strs){
        int len=str.length();
        strbld.append(len).append('#').append(str);       
       }
       String res = new String(strbld);
       return res;
    }

    public List<String> decode(String str) {
      List<String> list = new ArrayList<>();
      int i=0;
      while(i<str.length()){
        int j=i;
        while(str.charAt(j)!='#'){
          j++;
        }
        int len= Integer.parseInt(str.substring(i,j));

        list.add(str.substring(j+1,j+len+1));
        i=j+len+1;
      }
      return list;
    }
}

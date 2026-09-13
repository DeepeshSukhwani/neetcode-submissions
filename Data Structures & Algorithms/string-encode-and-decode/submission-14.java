class Solution {

    public String encode(List<String> strs) {

      StringBuilder builder = new StringBuilder();

      for(String str : strs){
        builder.append(str.length()).append('#').append(str);
      }

      

      return builder.toString();
    
    }

    public List<String> decode(String str) {

      List<String> list = new ArrayList<>();

      int i=0;

      while(i<str.length()){

        int j=i;

        while(str.charAt(j)!='#'){
          j++;
        }

        int length = Integer.parseInt(str.substring(i,j));

        list.add(str.substring(j+1,j+1+length));

        i=j+1+length;


      }
     return list;
    }
}

class Solution {

    public String encode(List<String> strs) {

      StringBuilder builder = new StringBuilder();

      for(String str : strs){
        builder.append(str.length()).append('#').append(str);
      }
      String result = builder.toString();

      return result;
    
    }

    public List<String> decode(String str) {

      ArrayList<String> list = new ArrayList<>();

      int i=0;
      int j=0;
      
      while(i<str.length()){
        j=i;

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

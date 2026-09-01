class Solution {

    public String encode(List<String> strs) {
               StringBuilder sb = new StringBuilder();
                for(String str : strs){
                    int length = str.length();
                    sb.append(length).append('#').append(str);
                }
                String result = new String(sb);
                return result;
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
            String word = str.substring(j+1, j+1+length);

            list.add(word);

            i=j+1+length;

        }

        return list;

    }
}

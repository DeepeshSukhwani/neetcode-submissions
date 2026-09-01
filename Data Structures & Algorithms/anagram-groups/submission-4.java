class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>> map = new HashMap<>();

      for(String str : strs){
        int[] count = new int[26];

        for(char ch : str.toCharArray()){
            count[ch-'a']++;
        }
        StringBuilder sb = new StringBuilder();

        for(int num : count){
            sb.append(num).append('#');
        }

        String key = new String(sb);


        map.putIfAbsent(key,new ArrayList<>());

        map.get(key).add(str);

      }

      return new ArrayList<>(map.values());

        
    }
}

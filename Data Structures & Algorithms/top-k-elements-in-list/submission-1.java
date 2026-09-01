class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer>[] bucket= new List[nums.length+1];
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        
        for(int num : map.keySet()){
            int freq=map.get(num);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(num);
        }

        int[] res=new int[k];
        int c=0;
        for(int i=bucket.length-1; i>=0&& c<k;i--){
          if(bucket[i]!=null){
            for(Integer num: bucket[i])
            res[c++]=num;
          }
        }
        return res;
    }
}

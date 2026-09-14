class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0){
            return 0;
        }
        

       HashSet<Integer> set = new HashSet<>();

       for(int num : nums){
        set.add(num);
       }

       int max=1;
       

       for(int num:set){
        int currmax=1;
        
        if(!set.contains(num-1)){
        while(set.contains(num+1)){
            currmax++;
            num++;
        }
        }

        max=Math.max(max,currmax);
        
       }

       return max;



    }
}

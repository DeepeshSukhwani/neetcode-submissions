class Solution {
    public int longestConsecutive(int[] nums) {

       HashSet<Integer> set = new HashSet<>();

       if(nums.length==0){
        return 0;
       }

       for(int num : nums){
        set.add(num);
       }

       int max=1;

       for(int num : set){
        int currmax=1;

        if(!set.contains(num-1)){
            while(set.contains(num+1)){
                currmax++;
                num++;
            }
            max=Math.max(max,currmax);
        }

       }

       return max;



    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        

        if(nums.length==0){
            return 0;
        }

        Arrays.sort(nums);

        int max=1;
        int currmax=1;

        for(int i=1;i<nums.length;i++){
            
            if(nums[i]==nums[i-1]+1){
              currmax++;
            }
            else if(nums[i]==nums[i-1]){
                continue;
            }
            else{
                currmax=1;
            }

            max=Math.max(max,currmax);
        }

        return max;
    }
}

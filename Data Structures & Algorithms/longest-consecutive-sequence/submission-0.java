class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;

        for(int i=0;i<nums.length;i++){
            int length=1;
            int current = nums[i];

            while(ls(nums,current+1)){
                current++;
                length++;
            }
            longest=Math.max(length,longest);
        }

        return longest;
    }

    private boolean ls(int[] nums,int target){
        for(int num : nums){
            if(num==target){
                return true;
            }
        }
        return false;
    }
}

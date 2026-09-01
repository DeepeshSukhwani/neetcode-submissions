class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int left=0;

        int[] res = new int[nums.length-k+1];
        

        for(int right=k-1;right<nums.length;right++){
            int max = Integer.MIN_VALUE;
            for(int j=left;j<=right;j++){
               if(nums[j]>max){
                max=nums[j];
               }
            }
            res[left]=max;
            left++;
        }

        return res;


        
    }
}

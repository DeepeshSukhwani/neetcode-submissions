class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
Arrays.sort(nums);
        int i=0;

        List<List<Integer>> result = new ArrayList<>();

        while(i<nums.length){
            int left=i+1;
            int right=nums.length-1;

            if(i>0 && nums[i]==nums[i-1]){
                i++;
                continue;
            }

            while(left<right){
                 int sum = nums[i] + nums[left] + nums[right];

                 if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;

                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }

                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                    
                 }

                 else if(sum>0){
                    right--;
                 }

                 else if(sum<0){
                    left++;
                 }      
            } 
            i++;
        }
        return result;
        
    }
}

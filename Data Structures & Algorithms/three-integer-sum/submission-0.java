class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;

             // Skip duplicate first elements
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }


            while(j<k){

                int sum=nums[j]+nums[k]+nums[i];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                     result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                     j++;
                     k--;

                      // Skip duplicate left values
                    while(j < k &&
                          nums[j] == nums[j - 1]) {
                        j++;
                    }

                     // Skip duplicate right values
                    while(j < k &&
                          nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return result;
    }
}

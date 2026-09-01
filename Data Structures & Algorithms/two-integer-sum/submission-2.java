class Solution {
    public int[] twoSum(int[] nums, int target) {



        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
           map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
          int secondNumber=target-nums[i];
          if(map.containsKey(secondNumber) && i!=map.get(secondNumber)){
            return new int[]{i,map.get(secondNumber)};
          }
          
        }
        return new int[]{0};
    }
}

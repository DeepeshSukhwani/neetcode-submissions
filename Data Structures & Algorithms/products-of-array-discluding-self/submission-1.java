class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];

        res[0] =1;

        for(int i=1;i<nums.length;i++){
           res[i]=res[i-1]*nums[i-1];
        }
        
        int rightProd=1;

        for(int j=nums.length-2;j>=0;j--){
          rightProd*= nums[j+1];
          res[j]=res[j]*rightProd;
        }

        return res;
    }
    
}  

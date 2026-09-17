class Solution {
    public int trap(int[] height) {

        int left=0;
        int maxleft=0;
        int right =height.length-1;
        int maxright=0;
        int result=0;

        while(left<right){
            if(height[left]<height[right]){
                maxleft=Math.max(maxleft,height[left]);
                result+=maxleft-height[left];
                left++;
            }
            else{
                maxright=Math.max(maxright,height[right]);
                result+=maxright-height[right];
                right--;
            }
        }
        return result;

        
    }
}

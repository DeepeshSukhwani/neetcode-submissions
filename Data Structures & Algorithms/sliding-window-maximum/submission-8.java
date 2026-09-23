class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {


   int[] result = new int[nums.length-k+1];
   int idx=0;
    Deque<Integer> dq = new ArrayDeque<>();

    for(int right=0;right<nums.length;right++){
      int left = right-k+1;

      if(!dq.isEmpty() && dq.peekFirst()<left){
        dq.pollFirst();
      }

      while(!dq.isEmpty() && nums[dq.peekLast()]<nums[right]){
        dq.removeLast();
      }

      dq.addLast(right);

      if(right>=k-1){
        result[idx++]=nums[dq.peekFirst()];
      }

    }

    return result;

       
    }
}
class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

      Deque<Integer> deque = new ArrayDeque<>();

      int[] result = new int[nums.length-k+1];

      int idx=0;

      for(int right=0;right<nums.length;right++){

      int left = right-k+1;

      while(!deque.isEmpty() && deque.peekFirst()<left){
        deque.pollFirst();
      }

      while(!deque.isEmpty() && nums[deque.peekLast()]<nums[right]){
        deque.pollLast();
      }

      deque.addLast(right);

      if(right>=k-1){
        result[idx++]=nums[deque.peekFirst()];
      }

      


      }

      return result;



       
    }
}
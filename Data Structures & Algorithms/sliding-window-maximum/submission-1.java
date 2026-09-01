class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // value,index
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0]-a[0]);

       int ans[] = new int[nums.length-k+1];
       int idx=0;
        for(int i=0;i<nums.length;i++){
            
            pq.offer(new int[] {nums[i], i});

            //Remove element from outside the window 
            while(pq.peek()[1]<=i-k){
                pq.poll();
            }

            if(i>=k-1){
                ans[idx++]= pq.peek()[0];
            }
        }

        return ans;


        
    }
}

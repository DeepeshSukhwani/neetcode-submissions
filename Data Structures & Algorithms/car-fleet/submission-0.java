class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        
      Map<Integer,Double> map = new TreeMap<>(Collections.reverseOrder());

      for(int i=0;i<position.length;i++){
        double time=(double)(target-position[i])/speed[i];
        map.put(position[i],time);
      }

      int count=0;
      double prev=0;

      for(double time:map.values()){
         if(time>prev){
            count++;
            prev=time;
         }
      }

      return count;



        
    }
}

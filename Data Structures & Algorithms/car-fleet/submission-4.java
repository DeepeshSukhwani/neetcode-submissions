class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
      int n=position.length;
      double[][] cars = new double[n][2];
      

      for(int i=0;i<position.length;i++){
        double time=(double)(target-position[i])/speed[i];
        cars[i][0]=position[i];
        cars[i][1]=time;
      }

      Arrays.sort(cars, (a,b)->Double.compare(b[0],a[0]));

    Stack<Double> stack = new Stack<>();
      for(double[] car:cars){
         if(stack.isEmpty() || car[1]>stack.peek()){
           stack.push(car[1]);
         }
      }

      return stack.size();



        
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temp) {

        Stack<Integer> stack = new Stack<>();

        int[] result = new int[temp.length];

        for(int i=0;i<temp.length;i++){

            while(!stack.isEmpty() && temp[i]>temp[stack.peek()]){
                int index=stack.pop();
                result[index]=i-index;
            }
            stack.push(i);
        }

        return result;
        

    }
}

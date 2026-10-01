class Solution {
    public int[] dailyTemperatures(int[] temp) {
        

        Stack<Integer> stack = new Stack<>();

        int result[] = new int[temp.length];

        stack.push(0);

        for( int i=1;i<temp.length;i++){

            while(!stack.isEmpty() && temp[i]>temp[stack.peek()] ){
                int j= stack.pop();

                result[j]=i-j;
            }
            stack.push(i);
        }

        return result;
    }
}

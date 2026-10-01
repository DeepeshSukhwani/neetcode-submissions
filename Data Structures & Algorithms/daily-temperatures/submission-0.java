class Solution {
    public int[] dailyTemperatures(int[] temp) {

        int[] result = new int[temp.length];

        for(int i=0;i<temp.length-1;i++){
            for(int j=i+1;j<temp.length;j++){
                if(temp[i]<temp[j]){
                   result[i]=j-i;
                   break;
                }
            }
        }

        return result;
        
    }
}

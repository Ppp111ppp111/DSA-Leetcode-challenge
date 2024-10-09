class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int [] res = new int[k];
        for (int i = 0 ; i<k ; i++){
            res[i]=nums[i];
        }
        for (int i=k; i<nums.length; i++){
            int min = res[0];
            int minIdx = 0;
            for (int j = 1 ; j<k ; j++){
                if (min>res[j]){
                    min=res[j];
                    minIdx=j;
                } 
            }
            if (nums[i]>min){
                for (int l = minIdx+1; l<k ; l++){
                    res[l-1]=res[l];
                }
            res[k-1]=nums[i];
            }

        }
        return res;
    }
}
        
        

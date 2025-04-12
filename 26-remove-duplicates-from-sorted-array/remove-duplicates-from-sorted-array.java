class Solution {
    public int removeDuplicates(int[] nums) {
          
        //   HashSet<Integer> s= new HashSet<>();
        // int idx=0;
        // for (int i = 0; i < nums.length; i++) {
        // if(!s.contains(nums[i])){
        //     s.add(nums[i]);
        //     nums[idx++]=nums[i];
        // }
        // }

        // return idx;

//approch-2
if (nums.length<= 1)
            return nums.length;
int idx=1;
for(int i=1;i<nums.length;i++){
    if(nums[i]!=nums[i-1]){
        nums[idx++]=nums[i];
    }
}
return idx;



    }
}

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
// int []arr=new int [nums.length+1];
// for(int i:nums){
//     arr[i]++;
// }

// List<Integer>res=new ArrayList<>();
// for(int i=1;i<arr.length;i++){
//     if(arr[i]==2){
//     res.add(i);
//     }
// }
   
// return res;




// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.List;


        HashSet<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                result.add(num);
            } else {
                seen.add(num);
            }
        }
        
        return result;
    }

    
}

    


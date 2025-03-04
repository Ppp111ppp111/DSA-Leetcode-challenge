class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0)return new int[0];
        int []result=new int[nums.length-k+1];
        ArrayDeque<Integer>deque=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            while (!deque.isEmpty()&&deque.peek()<i-k+1){
                deque.poll();
            
            }
            while(!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offer(i);
            if(i>=k-1){
                result[i-k+1]=nums[deque.peek()];
            }
           
        }
         return result;
    }
}
class Solution {
    public int findClosestNumber(int[] nums) {
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            if(Math.abs(min)>Math.abs(current)){
                min=current;
            }
            else if(Math.abs(min)==Math.abs(current) && current>min){
                min=current;
            }
        }
        return min;
        
    }
}

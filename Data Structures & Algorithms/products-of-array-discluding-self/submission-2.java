class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftprod[] = new int[nums.length];
       // int rightprod[] = new int[nums.length];
        int prod=1;

        for(int i=0; i< nums.length; i++){
            leftprod[i]=prod;
            prod= prod*nums[i];
        }
        prod=1;
        for(int i=nums.length-1; i>=0;i--){
            leftprod[i]*=prod;
            prod= prod*nums[i];
        }
        return leftprod;
    }
}  
//[2*3*4,1*3*4,1*2*6,1*2*4]
//[1,1,2,8]
//[48,24,6,1]

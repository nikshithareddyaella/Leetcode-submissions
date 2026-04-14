class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftprod[] = new int[nums.length];
        int rightprod[] = new int[nums.length];
        int res[]= new int[nums.length];
        int prod=1, prod2=1;

        for(int i=0; i< nums.length; i++){
            leftprod[i]=prod;
            prod= prod*nums[i];
        }
        for(int i=nums.length-1; i>=0;i--){
            rightprod[i]=prod2;
            prod2= prod2*nums[i];
        }

        for(int i=0;i< nums.length; i++)
        {
            res[i]=leftprod[i]*rightprod[i];
        }
        return res;
    }
}  
//[2*3*4,1*3*4,1*2*6,1*2*4]
//[1,1,2,8]
//[48,24,6,1]

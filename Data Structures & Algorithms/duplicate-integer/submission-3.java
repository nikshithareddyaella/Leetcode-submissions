class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int i:nums){
            if(!s.add(i)) //1,2,3,
            return true;
        }
        return false;
    }
}
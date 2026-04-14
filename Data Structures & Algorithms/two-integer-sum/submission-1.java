class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!h.containsKey(target-nums[i]))
            h.put(nums[i],i);// nums as key, and index as values
            else
            return new int[]{h.get(target-nums[i]),i};
        }
        return new int[]{};

        }
        
    }

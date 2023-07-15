import java.util.Arrays;

class Solution {
    public int findMaxK(int[] nums) {

        Arrays.sort(nums);

        for(int i = nums.length-1; i > 0; i--){
            if(nums[i] > 0){
                int target = nums[i];
                for(int j = i-1; j >= 0; j--){
                    if(nums[j] < 0 && Math.abs(nums[j]) == target)
                        return target;
                }
            }
        }
        return -1;

    }
}
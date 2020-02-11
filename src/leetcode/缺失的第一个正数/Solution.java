package leetcode.缺失的第一个正数;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        int biggest = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]>biggest){
                biggest = nums[i];
            }
        }
        byte[] map = new byte[biggest];
        for(int i = 0; i<nums.length;i++){
            if(nums[i]>0 && nums[i]!=biggest){
                map[nums[i]] = 0x01;
            }

        }
        int i = 1;
        for(; i<map.length;i++){
            if(map[i]!=0x01){
                return i;
            }
        }
        return i;
    }
}

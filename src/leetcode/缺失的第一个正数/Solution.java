package leetcode.缺失的第一个正数;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        int positiveCount = 0;
/*
当nums中有n个正数，那么结果可定在[1,n+1]中，所以只需要创建n+1大小的数组即可
 */
        for(int i = 0; i<nums.length;i++){
            if(nums[i]>0){
                positiveCount++;
            }
        }
        byte[] map = new byte[positiveCount+1];
        for(int i = 0; i<nums.length;i++){
            if(nums[i]>0  && nums[i]<map.length){
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

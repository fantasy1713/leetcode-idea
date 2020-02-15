package leetcode.跳跃游戏2;

class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
        System.out.println(s.jump(nums));
    }

    public int jump(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int steps = 0;
        int[] arr = new int[nums.length];
        int head = 0;
        for (int i = 0; i < arr.length - 1;i++ ) {
            int stepLen = nums[i];
            int currentStep = arr[i];

            for (int j = head-i+1; j <= stepLen; j++) {
                if ((i + j) >= (nums.length - 1)) {
                    return currentStep + 1;
                }

                int temp = currentStep + 1;
                if (temp < arr[i + j] || arr[i + j] == 0) {
                    arr[i + j] = temp;
                    head = i+j;
                }
            }
        }
        steps = arr[arr.length - 1];

        return steps;

    }
}
package leetcode.接雨水;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        //int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height = {4,3,1,2};
        System.out.println(s.trap(height));
    }

    public int trap(int[] height) {
        int count = 0;
        if (height.length <= 2) {
            return 0;
        }
        int currentHeight = 0;
        int len = height.length;
        //去掉前面空白
        int i = 0;
        for (; i <= height.length; i++) {
            if (height[i] > 0) {
                break;
            }
        }
        for (; i < len; i++) {
            currentHeight = height[i];
            boolean tryAgain = false;//当出现 [4,2,3]这种前高厚低的情况，用于重试
            do {
                //往后找，看有没有大于等于当前高度的
                int gapEnd = i + 1;
                int tempCount = 0;
                boolean hasGap = false;
                int maxInBehind = 0;
                for (int j = i + 1; j < height.length; j++) {
                    if (height[j] > maxInBehind) {
                        maxInBehind = height[j];
                    }
                    if (height[j] >= currentHeight) {
                        hasGap = true;
                        gapEnd = j;
                        break;
                    } else {
                        tempCount += (currentHeight - height[j]);
                    }
                }
                if (hasGap) {
                    count += tempCount;
                    i = gapEnd - 1;
                    tryAgain = false;
                } else {
                    currentHeight = maxInBehind;
                    tryAgain = !tryAgain;

                }
            } while (tryAgain);


        }
        return count;
    }
}

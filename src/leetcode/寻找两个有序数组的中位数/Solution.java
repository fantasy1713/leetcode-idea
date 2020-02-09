package leetcode.寻找两个有序数组的中位数;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = merge(nums1, nums2);
        int len = merged.length;
        if ((len & 0x01) == 1) {
            return (double) merged[len / 2];
        } else {
            return (double)(merged[len >> 1] + merged[(len >> 1) - 1])/2;
        }

    }

    private int[] merge(int[] arr1, int[] arr2) {
        if (arr1.length == 0) {
            return arr2;
        } else if (arr2.length == 0) {
            return arr1;
        }
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;//arr1 游标
        int j = 0;//arr2 游标
        int k = 0;//结果数组游标
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        return result;
    }
}

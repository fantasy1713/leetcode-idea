package leetcode.寻找两个有序数组的中位数;

public class Solution {

    public static void main(String[] args){
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        Solution s = new Solution();
        System.out.println(s.findMedianSortedArrays(nums1,nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len = nums1.length+nums2.length;
        int n = 0;
        int m = 0;
        int mid_index = len / 2;
        int i = 0;//nums1 游标
        int j = 0;//nums2 游标
        for (int k = 0; k <= mid_index; k++) {
            if (i < nums1.length && j < nums2.length) {
                n = m;
                if (nums1[i] < nums2[j]) {
                    m = nums1[i++];
                } else {
                    m = nums2[j++];
                }
            }
            else if (i < nums1.length) {
                n = m;
                m = nums1[i++];
            }
            else if(j < nums2.length) {
                n = m;
                m = nums2[j++];
            }
        }
        if ((len & 0x01) == 1) {
            return m;
        } else {
            return (double) (m+n) / 2;
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

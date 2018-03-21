package com.lico.study.leetcode.array;

/**
 * 项目：lico-study
 * 包名：com.lico.study.leetcode.array
 * 功能：
 * 时间：2018-02-27
 * 作者：miaoxw
 */
public class Solution1 {

    /**
     * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     * Example:
     * Given nums = [1,1,2],
     * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
     * It doesn't matter what you leave beyond the new length.
     */
    private static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int j = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        System.err.println(removeDuplicates(new int[]{1, 1, 2, 3, 4, 5, 5}));
    }
}

package com.lico.study.leetcode.array;

import java.util.Arrays;

/**
 * 项目：lico-study
 * 包名：com.lico.study.leetcode.array
 * 功能：
 * 时间：2018-02-27
 * 作者：miaoxw
 */
public class Solution3 {
    /**
     * Rotate an array of n elements to the right by k steps.
     * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
     * Note:
     * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
     * Related problem: Reverse Words in a String II
     * Credits:
     * Special thanks to @Freezen for adding this problem and creating all test cases.
     */
    public static int[] rotate(int[] nums, int k) {
        int j = nums.length, a = 1;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = nums[i + k];
            nums[i] = nums[j - k];
            nums[i + k] = x;
            nums[j - k] = y;
            if (a++ <= k) {
                continue;
            }
            break;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.err.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 1)));
    }
}

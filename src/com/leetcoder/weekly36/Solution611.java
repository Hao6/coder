package com.leetcoder.weekly36;

import java.util.Arrays;

/**
 * Created by hao on 17-6-13.
 */
//611. Valid Triangle Number
public class Solution611 {
    public int triangleNumber(int[] nums) {
        int ret = 0;
        int numsLen = nums.length;
        if (numsLen < 3)
            return 0;
        Arrays.sort(nums);
        for (int i = 0; i < numsLen; i++) {
            for (int j = i + 1; j < numsLen; j++) {
                for (int z = j + 1; z < numsLen; z++) {
                    if (nums[z] < nums[i] + nums[j]) {
                        ret++;
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }
        return ret;
    }
}

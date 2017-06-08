package com.leetcoder;

import java.util.Arrays;

/**
 * Created by hao on 17-6-8.
 */
public class Solution532 {
    public int findPairs1(int[] nums, int k) {
        int ret = 0;
        int numsLen = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < numsLen; i++) {
            if (i + 1 < numsLen && nums[i + 1] != nums[i] || i + 1 == numsLen) {
                for (int j = i + 1; j < numsLen; j++) {
                    if (j + 1 < numsLen && nums[j + 1] != nums[j] || j + 1 == numsLen) {
                        if (nums[j] - nums[i] == k) {
                            ret++;
                            break;
                        } else if (nums[j] - nums[i] > k) {
                            break;   //不存在合适的pairs
                        }
                    }
                }
            }
        }
        return ret;
    }

    public int findPairs(int[] nums, int k) {
        int ret = 0;
        int numsLen = nums.length;
        if(numsLen==0 || numsLen==1)
            return 0;
        Arrays.sort(nums);
        int sign=nums[0];
        for (int i = 0; i < numsLen; i++) {
            if(i!=0 && nums[i]==sign)
                continue;
            for (int j = i + 1; j < numsLen; j++) {
                if (nums[j] - nums[i] == k && (j+1<numsLen && nums[j+1]!=nums[j] || j+1==numsLen)) {
                    ret++;
                    sign=nums[i];
                    break;
                }
            }
        }
        return ret;
    }
}

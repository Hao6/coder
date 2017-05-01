package com.leetcoder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hongji on 2017/4/21.
 */
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        int numsLen = nums.length;
        if (numsLen < 3)
            return ret;
        Arrays.sort(nums);
        for (int i = 0; i < numsLen; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1, z = numsLen - 1;
            while (j < z) {
                if (-(nums[j] + nums[z]) == nums[i]) {
                    List<Integer> help = new ArrayList<>();
                    help.add(nums[i]);
                    help.add(nums[j]);
                    help.add(nums[z]);
                    ret.add(help);
                    int curz = z, curj = j;
                    while (j < numsLen && nums[curj] == nums[j]) {
                        j++;
                    }
                    while (z > i && nums[z] == nums[curz]) {
                        z--;
                    }
                } else if (-(nums[j] + nums[z]) > nums[i]) {
                    j++;
                } else {
                    z--;
                }
            }
        }
        return ret;

    }
}

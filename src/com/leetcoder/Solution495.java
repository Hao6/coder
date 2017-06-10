package com.leetcoder;

/**
 * Created by hongji on 2017/6/9.
 */
public class Solution495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int timeSeriesLen=timeSeries.length;
        if(timeSeriesLen==0)
            return 0;
        else if(timeSeriesLen==1)
            return duration;
        int ret=duration;
        int stepTime=0;
        for(int i=1;i<timeSeriesLen;i++){
            stepTime=timeSeries[i]-timeSeries[i-1];
            if(stepTime<=duration)
                ret+=stepTime;
            else
                ret+=duration;
        }
        return ret;
    }
}

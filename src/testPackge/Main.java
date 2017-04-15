package testPackge;

import java.util.Scanner;

/**
 * Created by hongji on 2017/3/24.
 */

    public class Main {
        public static void main(String[] args)  {
            Scanner in = new Scanner(System.in);
            int maxQps= Integer.valueOf(in.nextLine());
            final String[] rtList = in.nextLine().split(",");
            final int requestNum = Integer.valueOf(in.nextLine());
            final int threadNum = Integer.valueOf(in.nextLine());
            System.out.println(doneTime(maxQps, rtList, requestNum, threadNum));
        }
        /**
         * 如果使用最优的最大吞吐量负载均衡算法，按照最优模型多久能够处理完所有请求，单位毫秒。
         * @return
         */
        static long doneTime(int maxQps,String[] rtList,int requestNum,int threadNum) {
            //TODO

            int retTime=0;
            int count=0;
            int time=1;
            int countOfTime=0;
            for(int i=0;i<rtList.length;i++){
                if(time%Integer.valueOf(rtList[i])!=0)
                    time*=Integer.valueOf(rtList[i]);
            }
            for(int i=0;i<rtList.length;i++){
                countOfTime+=time/Integer.valueOf(rtList[i]);
            }
            if(requestNum%threadNum==0){
                count=requestNum/threadNum;
            }
            else{
                count=requestNum/threadNum+1;
            }
            retTime=(count/countOfTime)*time;
            int temp=(count%countOfTime);
            for(int i=0;i<rtList.length && temp>0;i++,temp-=Integer.valueOf(rtList[i])){
                retTime+=Integer.valueOf(rtList[i]);
            }
            return retTime*threadNum;
        }
    }



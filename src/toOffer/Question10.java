package toOffer;

/**
 * Created by hongji on 2017/3/12.
 */
public class Question10 {
    /**
     * 判断一个int类型的整数转换为二进制后，1的个数
     * @param intData
     * @return
     */
    public int solve(int intData){
        int count=0,demo=1;
        while(intData!=0){
            if((intData & demo)!=0)
                ++count;
            intData >>>= demo;
        }
        return count;
    }
    public int solve1(int intData){
        int count=0,demo=1;
        while(demo!=0){
            if((intData & demo)==demo)
                ++count;
            demo<<=1;
        }
        return count;
    }
    public int solve2(int intData){
        int count=0;
        while(intData!=0){
            ++count;
            intData&=(intData-1);
        }
        return count;
    }
    public int solve3(int intData){
        intData=(intData&0x55555555)+((intData>>>1)&0x55555555);
        intData=(intData&0x33333333)+((intData>>>2)&0x33333333);
        intData=(intData&0x0f0f0f0f)+((intData>>>4)&0x0f0f0f0f);
        intData=(intData&0x00ff00ff)+((intData>>>8)&0x00ff00ff);
        intData=(intData&0x0000ffff)+((intData>>>16)&0x0000ffff);
        return intData;
    }
}

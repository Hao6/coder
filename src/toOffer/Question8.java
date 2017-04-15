package toOffer;
import cn.edu.redSkyline.ArrayUnit;

/**
 * Created by hongji on 2017/3/12.
 */

public class Question8 {
    /**
     * 接受一个发生旋转的int类型的数组，未旋转前，该数组是一个非递减数组
     * @param intArr，如上所描述的数组
     */
    public int solve(Integer intArr[]){
        int beginIndex=0,endIndex=intArr.length-1,middleIndex=0;
        int leftData=0,rightData=0,middleData=0;
        if(endIndex-beginIndex==0)
            return intArr[beginIndex];
        while(true){
            if(endIndex-beginIndex==1)
                return intArr[endIndex];  //找到了
            leftData=intArr[beginIndex];
            rightData=intArr[endIndex];
            middleIndex=beginIndex+(endIndex-beginIndex)/2;
            middleData=intArr[middleIndex];
            if(leftData==rightData){
                if(middleData==leftData){
                    //转入顺序查找
                    return ArrayUnit.getSmallest(intArr);
                }else{
                    if(middleData>leftData)
                        beginIndex=middleIndex;
                    else if(middleData<rightData)
                        endIndex=middleIndex;
                }
            }else{
                if(middleData>=leftData)
                    beginIndex=middleIndex;
                else if(middleData<=rightData)
                    endIndex=middleIndex;
            }

        }
    }
}

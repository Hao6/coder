package toOffer;

import cn.edu.redSkyline.ArrayUnit;

/**
 * Created by hongji on 2017/3/20.
 */
public class Question34 {
    //求由小到大排列的丑数
    public static int[] solve(int maxIndex){
        assert (maxIndex>=1);
        int []answerArr=new int[maxIndex];
        answerArr[0]=1;         //最小的丑数1
        int T2=0;
        int T3=0;
        int T5=0;
        int temp2,temp3,temp5;
        for(int i=1;i<maxIndex;i++){
            temp2=answerArr[T2]*2;
            temp3=answerArr[T3]*3;
            temp5=answerArr[T5]*5;
            answerArr[i]=temp2<(temp3<temp5?temp3:temp5)?temp2:(temp3<temp5?temp3:temp5);
            //取三者中最小的一个
            for(int j=T2;j<=i;j++){
                if(answerArr[j]*2>answerArr[i]){
                    T2=j;
                    break;
                }
            }
            for(int j=T3;j<=i;j++){
                if(answerArr[j]*3>answerArr[i]){
                    T3=j;
                    break;
                }
            }
            for(int j=T5;j<=i;j++){
                if(answerArr[j]*5>answerArr[i]){
                    T5=j;
                    break;
                }
            }
        }
        return answerArr;
    }

    public static void main(String[] args) {
        int intArr[]=Question34.solve(18);  //前18个丑数
        for(int i=0;i<intArr.length;i++){
            System.out.print(intArr[i]+" ");
        }
        System.out.println();
    }
}

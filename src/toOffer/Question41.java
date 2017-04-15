package toOffer;

/**
 * Created by hongji on 2017/3/17.
 */
public class Question41 {
    public static void solve(int intArr[], int sum) {  //在一个递增数组中寻找两个数字，
        // 这两个数字的和作为参数传入
        int i = 0;
        int j = intArr.length - 1;
        while (j > i) {
            if (intArr[i] + intArr[j] == sum) {
                System.out.println(intArr[i] + " " + intArr[j]);
                i++;
                j--;
            } else if (intArr[i] + intArr[j] < sum) {
                i++;
            } else {
                j--;
            }
        }
    }

    public static void solve1(int sum) {  //输出[1,sum)之间的连续子数组，其和等于给定数值，
        // 连续子数组的和必须不小于2
        int endData = (sum + 1) / 2;   //商向上取整，表示遍历的范围为[1,endData],步长为1
        if (sum % 2 == 1) {  //sum是奇数
            int tempBusiness;
            int tempRemainder;
            for (int i = 1; i <= endData; i += 2) {  //合法连续子数组的长度是奇数
                tempRemainder = sum % i;
                tempBusiness = sum / i;
                if (tempRemainder == 0 && tempBusiness % 2 == 1) {  //i可以整除sum并且商是个奇数
                    int idealHalfLen = (tempBusiness - 1) / 2;  //可能连续子数组除去中间位
                    // 置后理想长度的一半
                    if (idealHalfLen < i && i+idealHalfLen <= endData) {
                        for (int j = i - idealHalfLen; j <= i+idealHalfLen; j++) {
                            System.out.print(j + " ");
                        }
                        System.out.println(); //换行
                    }
                }
            }
            //合法连续子数组的长度为偶数
            int tempSum;   //相邻两项的和
            for (int i = 1; i < endData; i++) {
                tempSum=i+i+1;
                tempRemainder = sum % tempSum;
                tempBusiness = sum / tempSum;
                if(tempRemainder==0){  //tempSum可以整除sum并且商是一个偶数
                    int idealHalfLen = tempBusiness-1;//可能连续子数组除去中间两位后，
                    // 理想长度的一半
                    if(idealHalfLen < i && i+1+idealHalfLen <= endData ){
                        for(int j=i-idealHalfLen;j<=i+1+idealHalfLen;j++){
                            System.out.print(j + " ");
                        }
                        System.out.println(); //换行
                    }
                }
            }
        } else {   //sum是偶数
            int tempBusiness;
            int tempRemainder;
            for (int i = 2; i <= endData; i += 2) {  //合法连续子数组的长度是奇数
                tempRemainder = sum % i;
                tempBusiness = sum / i;
                if (tempRemainder == 0 && tempBusiness%2==1) {  //i可以整除sum并且商是个奇数
                    int idealHalfLen = (tempBusiness-1)/2;  //可能连续子数组除去中间位
                    // 置后理想长度的一半
                    if (idealHalfLen < i && i+idealHalfLen <= endData) {
                        for (int j = i - idealHalfLen; j <= i+idealHalfLen; j++) {
                            System.out.print(j + " ");
                        }
                        System.out.println(); //换行
                    }
                }
            }
            //合法连续子数组的长度为偶数
            int tempSum;   //相邻两项的和
            for (int i = 1; i < endData; i++) {
                tempSum=i+i+1;
                tempRemainder = sum % tempSum;
                tempBusiness = sum / tempSum;
                if(tempRemainder==0){  //tempSum可以整除sum并且商是一个偶数
                    int idealHalfLen = tempBusiness-1;//可能连续子数组除去中间两位后，
                    // 理想长度的一半
                    if(idealHalfLen < i && i+1+idealHalfLen <= endData ){
                        for(int j=i-idealHalfLen;j<=i+1+idealHalfLen;j++){
                            System.out.print(j + " ");
                        }
                        System.out.println(); //换行
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int []intArr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //Question41.solve(intArr,15);
        Question41.solve1(22);
    }
}

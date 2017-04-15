package cn.edu.redSkyline;

/**
 * @author Hao Liu
 * @version 1.0.0.0
 * @since 1.0
 * Created by hongji on 2017/3/10.
 */

final public class DynamicProgramming {
    /**求最长公共子序列的长度
    * @param charArr0,一个字符数组
     * @param charArr1,另外一个字符数组
     * @return charArr0与charArr1的最长公共子序列的长度
    */
    public static int getMaxSubSequenceCount(char [] charArr0,char [] charArr1){
        int charArr0Len=charArr0.length;
        int charArr1Len=charArr1.length;
        int maxLen=0;  //暂时的最大长度
        int len[][]=new int[charArr0Len][charArr1Len];  //中介数组
        /*初始化[0,charArr0Len],0*/
        for(int i=0;i<charArr0Len;i++){
            if(charArr0[i]==charArr1[0])
                len[i][0]=1;
            else
                len[i][0]=0;
        }
        /*初始化0,[0,charArr1Len]*/
        for(int i=0;i<charArr1Len;i++){
            if(charArr1[i]==charArr0[0])
                len[0][i]=1;
            else
                len[0][i]=0;
        }
        /*向后迭代*/
        for(int i=1;i<charArr0Len ;i++){
            for(int j=1;j<charArr1Len;j++){
                if(charArr0[i]==charArr1[j]){
                    len[i][j]=len[i-1][j-1]+1;
                }else
                    len[i][j]=len[i-1][j]>len[i][j-1]?len[i-1][j]:len[i][j-1];
            }
        }
        maxLen=len[charArr0Len-1][charArr1Len-1];
        return maxLen;
    }

    /**
     * 最长公共子序列的长度
     * @param charArr0,一个字符数组
     * @param charArr1,另一个字符数组
     * @return charArr0与charArr1的最长公共子序列的长度
     */
    public static int getMaxSubStrCount(char [] charArr0,char [] charArr1){  //赋予最大的访问权限，作为一
        // 个工具类来使用
        int charArr0Len=charArr0.length;
        int charArr1Len=charArr1.length;
        int maxLen=0;  //暂时的最大长度
        int len[][]=new int[charArr0Len][charArr1Len];  //中介数组
        /*初始化[0,charArr0Len],0*/
        for(int i=0;i<charArr0Len;i++){
            if(charArr0[i]==charArr1[0])
                len[i][0]=1;
            else
                len[i][0]=0;
        }
        /*初始化0,[0,charArr1Len]*/
        for(int i=0;i<charArr1Len;i++){
            if(charArr1[i]==charArr0[0])
                len[0][i]=1;
            else
                len[0][i]=0;
        }
        /*向后迭代*/
        for(int i=1;i<charArr0Len ;i++){
            for(int j=1;j<charArr1Len;j++){
                if(charArr0[i]==charArr1[j]){
                    len[i][j]=len[i-1][j-1]+1;
                }else
                    len[i][j]=0;
            }
        }
//        maxLen=len[charArr0Len-1][charArr1Len-1];
        for(int i=0;i<charArr0Len ;i++){
            for(int j=0;j<charArr1Len;j++){
                if(maxLen<len[i][j])
                    maxLen=len[i][j];
            }
        }
        return maxLen;
    }

    /**
     * 求一个数组的最大递增子序列
     * @param intArr，一个int类型的数组
     * @return intArr的最大递增子序列的长度
     * @throws NullPointerException
     */
    public static int getMaxIncresingSequenceCount(int intArr[]){
        try{
            int intArrLen=intArr.length;
            if(intArrLen==0)
                throw new NullPointerException(intArr+"为空");
            int help[]=new int[intArrLen];  //创建end数组
            int end=0;    //help数组的有效末尾
            help[0]=intArr[0];  //help[0]初始化为
            for(int i=1;i<intArrLen;i++){
                if(intArr[i]>help[end]){
                    help[++end]=intArr[i];
                }else if(intArr[i]==help[end]){
                    continue;   //啥都不做
                }
                else{
                    //转入二分查找程序，在合适的位置替换intArr[]的值，更新help数组信息
                    binarySearchAndReplace(help,end,intArr[i]);
                }
                return ++end;
            }
        }catch (NullPointerException e){
            System.out.println(e.getStackTrace());
        }finally {
            return 0;
        }

    }

    /**
     * 二分查找确定需要替换数值的位置，然后加以替换，替换的原则是找到最小的一个不小于replacer的值，
     * 如果找到的值比replacer大，则替换之，否则啥都不用做
     * @param help int类型的数组
     * @param end help数组的实际长度-1
     * @param replacer 需要替换的数值
     */
    public static void binarySearchAndReplace(int help[],int end,int replacer){  //由于传入数组引用，
        // 所以可以修改其内的数值
        int i=0,j=end,count;   //二分查找的上下限度,折中值
        while(i<=j){
            if(i==j){
                help[i]=replacer;  //已经找到替换值，发生替换即可
                return;
            }
            //count=(i+j)/2;   //可能造成加法溢出
            count=i+(j-i)/2;   //避免加法溢出
            if(help[count]<replacer){
                i=count+1;
            }else if(help[count]>replacer){
                if(help[count-1]>replacer)
                    j=count-1;
                else{
                    help[i]=replacer;  //已经找到替换值，发生替换即可
                    return;
                }
            }else{    //help[count]==replacer
                return;   //相当于相同的数值发生替换，啥都没发生
            }
        }
    }

}

package toOffer;

/**
 * Created by hongji on 2017/3/19.
 */
//投掷n个骰子，所有骰子和s的概率，s的和区间是[n,6n]
public class Question43 {
    public static final int MAX_INDEX=6;
    public static  double allArranges;  //全部的排列数==6^n
    public static void solve(int n){
        allArranges=Math.pow(MAX_INDEX,n);
        int sumOfNum[]=new int[MAX_INDEX*n-n+1];
//        for(int i=0;i<=MAX_INDEX*n-n;i++){
//            sumOfNum[i]=0;
//        }
        solve(n,sumOfNum);
        for(int i=0;i<=MAX_INDEX*n-n;i++){
            System.out.println(i+n+" "+sumOfNum[i]+" "+sumOfNum[i]/allArranges+" ");
        }
    }
    public static void solve(int n,int []sumOfNuM){
        solve(n,n,0,sumOfNuM);
    }
    public static void solve(int n,int current,int sum,int []sumOfNuM){
        if(current==0){
            sumOfNuM[sum-n]++;
        }else{
            for(int i=1;i<=MAX_INDEX;i++){
                solve(n,current-1,sum+i,sumOfNuM);
            }
        }
    }
    public static void solve1(int n){
        allArranges=Math.pow(MAX_INDEX,n);
        int sumOfNum[]=new int[MAX_INDEX*n+1];
        int sumOfNum1[]=new int[MAX_INDEX*n+1];
//        for(int i=0;i<=MAX_INDEX*n-n;i++){
//            sumOfNum[i]=0;
//            sumOfNum1[i]=0;
//        }
        for(int i=1;i<=MAX_INDEX;i++){
            sumOfNum[i]=1;
        }
        for(int i=2;i<=n;i++){
            if(i%2==0){  //i是偶数
                for(int j=i;j<=i*MAX_INDEX;j++){
                    sumOfNum1[j]=0;
                    for(int z=j-1;z>=0 && j-z<=6;z--){
                        sumOfNum1[j]+=sumOfNum[z];
                    }
                }
            }else{ //i是奇数
                for(int j=i;j<=i*MAX_INDEX;j++){
                    sumOfNum[j]=0;
                    for(int z=j-1;z>=0 && j-z<=6;z--){
                        sumOfNum[j]+=sumOfNum1[z];
                    }
                }
            }
        }
        if(n%2==0){
            sumOfNum=sumOfNum1;
        }
        for(int i=n;i<=MAX_INDEX*n;i++){
            System.out.println(i+" "+sumOfNum[i]+" "+sumOfNum[i]/allArranges+" ");
        }
    }

    public static void main(String[] args) {
        Question43.solve(4);
        System.out.println();
        Question43.solve1(4);
    }
}

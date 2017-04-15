package toOffer;


/**
 * Created by hongji on 2017/3/7.
 */
public class Question3 {
    int rows;
    public int colmns;
    public int [][]arr;
    public int searcher;   //需要查询的数值

    /**
     * public,只要能够拿到这个类，创建一个对象，便可以访问，或者类直接访问public静态成员
     * 默认情况，在同一个包下可见
     *
     */


    public static void main(String[] args) {
        Question3 q3=new Question3(5,3,-1);
        Positation posi=null;
        if(q3.rows==q3.colmns)
            posi=q3.regularSearch(0,0,q3.rows);
        else
            {
            int a = q3.rows < q3.colmns ? q3.rows : q3.colmns;
            posi=q3.regularSearch(0,0,a);
            if(posi==null){
                if(q3.rows<q3.colmns){
                    posi=q3.nRegularSearch(0,a,a,q3.colmns-a);
                }else
                    posi=q3.nRegularSearch(a,0,q3.rows-a,a);
            }
        }
        if(posi!=null)
            System.out.println(posi.toString());
        else
            System.out.println("不存在");

    }
    public Question3(int rows,int colmns,int searcher){  //构造函数
        this.searcher=searcher;
        this.rows=rows;
        this.colmns=colmns;
        this.arr=new int[rows][colmns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<colmns;j++){
                arr[i][j]=i+j;
            }
        }
    }
    public Positation twoPointsSearch(int rx,int ry,int lx,int ly) //左上角、右下角的坐标
    {
        Positation ret=null;
        //二分查找的序列
        //[lx,rlx],rly
        //rlx,[ly,rly]
        int i=lx,j=rx,count;
        while(i<=j){
            count=(i+j)/2;
            if(arr[count][ry]==searcher)
            {
                ret=new Positation(count,ry,arr[count][ry]);
                break;
            }else if(arr[count][ry]<searcher)
            {
                i=count+1;
            }
            else
                j=count-1;
        }
        if(ret==null) {   //在列方向上没有找到该元素，转到行方向上继续寻找
            i = ly;
            j = ry;
            while (i <= j) {
                count = (i + j) / 2;
                if (arr[rx][count] == searcher) {
                    ret = new Positation(rx, count, arr[rx][count]);
                    break;
                } else if (arr[rx][count] < searcher) {
                    i = count + 1;
                } else
                    j = count - 1;
            }
        }
        return ret;
    }
    public Positation regularSearch(int lx,int ly,int count){
        Positation ret=null;
        if(arr[lx][ly]==searcher)
            ret=new Positation(lx,ly,arr[lx][ly]);
        else if(arr[lx][ly]>searcher)
            return null;
        else
        {
            int tempx,tempy;
            for(int i=1;i<count;i++)
            {
                tempx=lx+i;
                tempy=ly+i;
                if(arr[tempx][tempy]==searcher) {
                    ret = new Positation(tempx, tempy, arr[lx][ly]); //找到
                    break;
                }
                else if(arr[tempx][tempy]>searcher){
                    //转入二分查找
                    ret=twoPointsSearch(tempx,tempy,lx,ly);
                    if(ret!=null)
                        break;
                }
            }
        }
        return ret;
    }
    public Positation nRegularSearch(int lx,int ly,int xcount,int ycount) { //行数、列数
        Positation ret=null;
        if (xcount == 1) {
            //转入二分查找
            ret=twoPointsSearch(lx+xcount-1,ly+ycount-1,lx,ly);
        } else if (ycount == 1) {
            //转入二分查找
            ret=twoPointsSearch(lx+xcount-1,ly+ycount-1,lx,ly);
        } else {
            int a = xcount < ycount ? xcount : ycount;
            ret=regularSearch(lx,ly,a);
            if(ret==null){
                if(xcount<ycount)
                {
                    ret=nRegularSearch(lx,ly+a,xcount,ycount-a);
                }else
                {
                    ret=nRegularSearch(lx+a,ly,xcount-a,ycount);
                }
            }
        }
        return ret;
    }
}

package testPackge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by hongji on 2017/3/8.
 */
 class Lettle {    //不能使用private与protected
    public int count;  //数量，公开
    String name;  //包可见
    protected String address;  //地址
    private String age;
    public Lettle(int count,String name,String address,String age){
        this.count=count;
        this.name=name;
        this.address=address;
        this.age=age;
    }
    public static void main(String[] args) {
//        PostOffice po=new PostOffice(2,"LH","75","21");
//        System.out.println(po.count+" "+po.address+" "+po.name);   //同包只不能访问private
        List<Integer> al=new ArrayList<Integer>();
        ArrayList<Integer> bl=new ArrayList<Integer>();
        bl.trimToSize();
        System.out.println(al.getClass().getName()+" "+bl.getClass().getName());
        al.add(6);
        al.add(7);
        al.addAll(al);
        Iterator<Integer> ial=al.listIterator();
        while(ial.hasNext()){
            System.out.println(ial.next());
        }

    }

}

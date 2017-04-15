package toOffer;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by hongji on 2017/3/15.
 */
public class Question35 {


    public Ranger solve(Ranger[] source){

        assert(source!=null);
        TreeMap<Ranger,Integer> help=new TreeMap<Ranger,Integer>(new RangerComparator());  //字符，整数映射表,其排序是基于key的Compare()
        // 方法实现的，与元素插入的顺序无关
        Ranger ret=null;
        for(Ranger temp: source){
            if(help.containsKey(temp)==false){
                help.put(temp,1);
            }else{
                int curValue=help.get(temp);
                help.put(temp,++curValue);
            }
        }
        Iterator it=help.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry=(Map.Entry)it.next();
            if((int)entry.getValue()==1){
                ret=(Ranger)entry.getKey();
                break;
            }
        }
        return ret;
    }
}

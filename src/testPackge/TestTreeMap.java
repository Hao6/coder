package testPackge;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by hongji on 2017/3/15.
 */
public class TestTreeMap  {
    TreeMap<Character,Integer> help=new TreeMap<>();  //字符，整数映射表,其排序是基于key的Compare()
    // 方法实现的，与元素插入的顺序无关

    public Character solve(Character[] source){
        assert(source!=null);
        Character ret=null;
        for(Character temp: source){
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
                ret=(Character)entry.getKey();
                break;
            }
        }
        return ret;
    }

}

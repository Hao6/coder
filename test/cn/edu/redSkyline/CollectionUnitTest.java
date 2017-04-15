package cn.edu.redSkyline;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongji on 2017/3/16.
 */
public class CollectionUnitTest extends TestCase {
    List<Character> list=new ArrayList<>();
    public void setUp() throws Exception {
        super.setUp();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('g');
    }
    public void testGetReverseKth() throws Exception {
        int charArrLen=list.size();
        int k=4;
        assertEquals(list.get(charArrLen-k),CollectionUnit.getReverseKth(list,k));
        //assertEquals(null,CollectionUnit.getReverseKth(list,k));
    }
    public void testRecycleList() throws Exception{
        int stepth=1;
        assertEquals('g',(char)CollectionUnit.recycleList(list,stepth));
    }
    public void testRecycleList1() throws Exception {
        int stepth=9;
        assertEquals((char)CollectionUnit.recycleList(list,stepth),
                (char)CollectionUnit.recycleList(list,stepth));
    }

}
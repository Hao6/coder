package Concurrent.ThinkingInJava.unit19;

/**
 * Created by hao on 17-5-2.
 */
enum Shrubbery{GROUND,CRAWLING,HANGING}
public class EnumClass {
    public static void main(String[] args) {
        for(Shrubbery s:Shrubbery.values()){
            System.out.println(s.ordinal()+" "+s.toString()+" "+
                    s.name()+" "+s.getDeclaringClass());
            System.out.println(s==Shrubbery.GROUND);
            System.out.println(s.compareTo(Shrubbery.HANGING));
        }
        for(String s:"GROUND,CRAWLING,HANGING".split(",")){
            Shrubbery shrub=Enum.valueOf(Shrubbery.class,s);  //根据传入的类型与字符串，返回与字符串对应的对象
            Shrubbery shrub1=Shrubbery.valueOf(s);
            Enum e=Shrubbery.GROUND;
            System.out.println(shrub==shrub1);
        }
    }
}

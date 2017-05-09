package Concurrent.ThinkingInJava.unit16;

/**
 * Created by hao on 17-5-9.
 */
class ClassParameter<T>{
    public T[] f(T[] arg){
        return arg;
    }
}
class MethodParameter{
    public static<T> T[] f(T[] arg){
        return arg;
    }
}
public class ParameterizedArrayType {
    public static void main(String[] args) {
        Integer []ints={1,2,3};
        Double []dous={1d,2d,3d};
        Integer[] ints1=new ClassParameter<Integer>().f(ints);
        Double []dous1=MethodParameter.f(dous);
    }

}

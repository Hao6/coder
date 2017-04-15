package testPackge;

/**
 * Created by hongji on 2017/3/12.
 */
public class VariableParameterList {
    public static void printParameterList(String... argv){
        for(String temp : argv){
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        printParameterList("qw","we","er","tr");
        String [] stringArr={"gh","jk","uio"};
        printParameterList(stringArr);
        printParameterList(); //啥都没有

    }
}

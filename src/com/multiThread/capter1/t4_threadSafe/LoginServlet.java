package com.multiThread.capter1.t4_threadSafe;

/**
 * Created by hao on 17-5-28.
 */
public class LoginServlet {
    private static String userName;
    private static String passWord;
    public  synchronized static void doPost(String username,String password){
        try {
            userName = username; //在没有同步的情况下，若a线程先进入该
            // 函数，但由于休眠了5秒，在此期间，b线程进入该函数，会将
            // userName修改，而a线程不会察觉到这种改变
            if ("a".equals(userName)) {
                Thread.sleep(5000);
            }
            passWord=password;
            System.out.println("username="+userName+
            " password="+passWord);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}

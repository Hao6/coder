package Concurrent.ThinkingInJava;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.sql.Time;
import java.util.concurrent.*;

/**
 * Created by hongji on 2017/4/5.
 */
public class CloseResource {
    public static void main(String []args) throws Exception {
        ExecutorService exec= Executors.newCachedThreadPool();
        ServerSocket server=new ServerSocket(8080);
        InputStream socketInput=
                new Socket("localhost",8080).getInputStream();
        InputStream in=System.in;
        exec.execute(new IOBlocked(in));
        exec.execute(new IOBlocked(socketInput));

        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println("Shutting down all threads");
        exec.shutdownNow();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Closing "+System.in.getClass().getName());
        in.close();  //在本机上上无法解除Block，？？？
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Closing "+socketInput.getClass().getName());
        socketInput.close(); //可以解除阻塞

    }
}

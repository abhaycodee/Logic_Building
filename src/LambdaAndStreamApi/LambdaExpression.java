package LambdaAndStreamApi;

import java.util.concurrent.Callable;

public class LambdaExpression {
    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 10; i++)
        {
            Runnable runnable  =()->{
                System.out.println("iam ninside the runnable interface");


            };
            Thread.sleep(100);



            Thread thread = new Thread(runnable);
            thread.start();
        }




    }
}

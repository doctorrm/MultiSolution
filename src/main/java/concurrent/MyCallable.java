package concurrent;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<String>> list = new ArrayList<Future<String>>();
        Callable<String> callable = new MyCallable();
        for (int i = 0; i < 50; i++) {
            Future<String> future = executorService.submit(callable);//线程池只有10，要执行50个线程，分50/10=5次进行，每进行完10个后重新调用call(),因此每执行输出10行就会等1s。
            list.add(future);
        }
        for (Future<String> fut : list) {
            System.out.println(new Date() + "::" + fut.get());
        }
        executorService.shutdown();
    }

}


















import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 本当迷
 * @Description 创建多线程的方式四：使用线程池
 * @date 2022/5/23-20:53
 */
public class 线程池 {
    public static void main(String[] args) {
        /**
         * 创建多线程的方式四：使用线程池
         *
         * 好处：
         *      1.提高响应速度（减少了创建新线程的时间）
         *      2.降低资源消耗（重复利用线程池中线程，不需要每次都创建）
         *      3.便于线程管理
         *          corePoolSize：核心池的大小
         *          maximumPoolSize：最大线程数
         *          keepAliveTime：线程没有任务时最多保持多长时间后会终止
         *
         * 面试题：创建多线程有几种方式？四种！继承thread类、实现runnable接口、实现callable接口、使用线程池
         */
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;

        service.execute(new NumberThread1());
        service.execute(new NumberThread2());
        service.shutdown();

    }
}
class NumberThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class NumberThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 本当迷
 * @Description 解决线程安全问题的方式三：lock锁---> JDK5.0新增
 * @date 2022/5/23-19:02
 */
public class LockTest {
    public static void main(String[] args) {
        Windows windows = new Windows();

        Thread thread = new Thread(windows);
        Thread thread1 = new Thread(windows);
        Thread thread2 = new Thread(windows);
        thread.setName("窗口一");
        thread1.setName("窗口二");
        thread2.setName("窗口三");
        thread.start();
        thread1.start();
        thread2.start();
    }
}

class Windows implements Runnable {
    private static int ticket = 40;
    private final ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                // 调用锁定方法：lock()
                reentrantLock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + ": " + "当前票数" + ticket);
                } else {
                    break;
                }
            } finally {
                // 调用解锁方法：unlock()
                reentrantLock.unlock();
            }
        }
    }
}
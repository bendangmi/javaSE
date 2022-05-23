/**
 * @author 本当迷
 * @Description 线程的通信
 * @date 2022/5/23-19:56
 */

import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程通信的例子：使用两个线程打印1-100。线程1, 线程2 交替打印
 *
 * 涉及到的三个方法：
 * wait():一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器。
 * notify():一旦执行此方法，就会唤醒被wait的一个线程。如果有多个线程被wait，就唤醒优先级高的那个。
 * notifyAll():一旦执行此方法，就会唤醒所有被wait的线程。
 *
 * 说明：
 *      1.wait()，notify()，notifyAll()三个方法必须使用在同步代码块或同步方法中。
 *      2.wait()，notify()，notifyAll()三个方法的调用者必须是同步代码块或同步方法中的同步监视器。
 *         否则，会出现IllegalMonitorStateException异常
 *      3.wait()，notify()，notifyAll()三个方法是定义在java.lang.Object类中。
 */
public class Test4 {
    public static void main(String[] args) {
        AlternatelyPrint alternatelyPrint = new AlternatelyPrint();
        Thread thread = new Thread(alternatelyPrint);
        Thread thread1 = new Thread(alternatelyPrint);
        thread.setName("线程一");
        thread1.setName("线程二");
        thread.start();
        thread1.start();

    }
}
class AlternatelyPrint implements Runnable {
    private static int num = 100;
    ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            synchronized (this) {
                this.notify(); // 唤醒被wait的线程
                if(num != 0){
                    num --;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + num);
                    try {
                        this.wait(); // 使线程沉睡，等待下一次被唤醒
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else{
                    break;
                }
            }
        }
    }
}
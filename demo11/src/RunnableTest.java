/**
 * @author 本当迷
 * @Description 创建多线程的方式二：实现Runnable接口
 * @date 2022/5/23-17:13
 */
public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable1 myRunnable1 = new MyRunnable1();
        MyRunnable2 myRunnable2 = new MyRunnable2();
        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);
        thread1.start();
        thread2.start(); // 通过Thread类的对象调用start():①启动线程 ②调用当前线程的run() --> 调用了Runnable类型的target的run()

    }
}

class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
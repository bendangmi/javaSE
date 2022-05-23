/**
 * @author 本当迷
 * @Description 多线程实现方式之一：继承Thread类的方式
 * @date 2022/5/23-16:30
 */
public class ThreadTest {
    public static void main(String[] args) {
        // 创建Thread类子对象
        MyThread myThread = new MyThread();
        // 启动线程
        myThread.start();

        // 一下操作仍在main中实现
        System.out.println("主线程");
        for (int i = 0; i < 10; i++) {
            if(i % 2 != 0){
                System.out.print(i + "");
            }
        }
        System.out.println();

        // 创建Thread类的匿名子类的方式 以下两种是一样的
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("本当迷学编程");
            }

        }).start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("编程学本当迷");
                }

            }
        }.start();



    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread类子对象线性");
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
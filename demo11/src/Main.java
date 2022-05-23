/**
 * @author 本当迷
 * @Description 多线程的基本使用
 * @date 2022/5/23-14:05
 */
public class Main {
    public static void main(String[] args) {
        /**
          多线程的创建，方式一：继承于Thread类
          1.创建一个继承于Thread类的子类
          2.重写Thread的run()方法 ---> 将此线程的方法声明在run()中
          3.创建Thread类的子对象
          4.通过此对象调用start()

          例子:遍历100以内的所有的偶数
         */


        /**
          Thread类的常用方法
          1.start():启动当前线程，执行当前线程的run()
          2.run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
          3.currentThread(): 静态方法，返回当前代码执行的线程
          4.getName():获取当前线程的名字
          5.setName():设置当前线程的名字
          6.yield():释放当前CPU的执行权
          7.join():在线程a中调用线程b的join(),此时线程a就进入阻塞状态，直到线程b完全执行完以后，线程a才
                   结束阻塞状态。
          8.stop():已过时。当执行此方法时，强制结束当前线程。
          9.sleep(long milli time)：让当前线程“睡眠”指定时间的milli time毫秒)。在指定的milli time毫秒时间内，
                                   当前线程是阻塞状态的。
          10.isAlive()：返回boolean，判断线程是否还活着
         */


        /**
          创建多线程的方式二：实现Runnable接口
          1.创建一个实现了Runnable接口得类
          2.实现类去实现Runnable中的抽象方法:run()
          3.创建实现类的对象
          4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
          5.通过Thread类的对象调用start()
         */

        /**
         *  比较创建线程的两种方式。
         *  开发中：优先选择：实现Runnable接口的方式
         *  原因：1. 实现的方式没有类的单继承性的局限性
         *       2. 实现的方式更适合来处理多个线程有共享数据的情况。
         *
         *  联系：public class Thread implements Runnable
         *  相同点：两种方式都需要重写run(), 将线程要执行的逻辑声明在run()中。
         */

    }
}

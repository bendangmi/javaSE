/**
 * @author 本当迷
 * @Description 线程安全卖票
 * @date 2022/5/23-17:41
 */
public class Test2 {
    public static void main(String[] args) {
        Window window = new Window();
        Thread thread = new Thread(window);
        Thread thread1 = new Thread(window);
        Thread thread2 = new Thread(window);
        thread.setName("线程一");
        thread1.setName("线程二");
        thread2.setName("线程三");
        thread.start();
        thread1.start();
        thread2.start();
    }
}

class Window implements Runnable {
    private static int ticket = 40;
    @Override
    public void run() {
        while(true){
            synchronized (this) {
                if(ticket > 0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + ": 当前票数为：" + ticket);
                }else{
                    break;
                }
            }

        }
    }
}

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 本当迷
 * @Description
 * @date 2022/5/23-19:21
 */
public class Test3 {
    public static void main(String[] args) {
        /**
         * 银行有一个账户。
         * 有两个储户分别向同一个账户存3000元，每次存1000，存3次。
         * 每次存完打印账户余额。
         *
         * 分析：
         *      1.是否是多线程问题？是，两个储户线程
         *      2.是否有共享数据？有，账户（或账户余额）
         *      3.是否有线程安全问题？有
         *      4.需要考虑如何解决线程安全问题？同步机制：有三种方式。
         */
        People people = new People("小美");
        People people1 = new People("小鹏");
        people.startSaveMoney();
        people1.startSaveMoney();

    }
}
class People {
    private String name;

    public People() {
    }

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 开始存钱
    public void startSaveMoney(){
        Account account = new Account();
        // 存三次钱
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(account);
            thread.setName(name);
            thread.start();
        }

    }

}
class Account implements Runnable{
    private static int over = 0;
    private final ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        saveMoney(1000);

    }
    public void saveMoney(int money){
        try {
            reentrantLock.lock();
            if(over < 3000){
                over += money;
                System.out.println(Thread.currentThread().getName() + "存钱成功，当前账号余额为:" + over);

            }else{
                System.out.println(Thread.currentThread().getName() + "存钱失败，当前账户已满3000元");
            }
        } finally {
            reentrantLock.unlock();
        }

    }
}
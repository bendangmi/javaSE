/**
 * @author 本当迷
 * @Description 多窗口卖票
 * @date 2022/5/23-16:52
 */
public class Test1 {
    public static void main(String[] args) {
        TicketWindow ticketWindow = new TicketWindow();
        TicketWindow ticketWindow1 = new TicketWindow();
        TicketWindow ticketWindow2 = new TicketWindow();
        ticketWindow.setName("窗口一");
        ticketWindow1.setName("窗口二");
        ticketWindow2.setName("窗口三");
        ticketWindow.start();
        ticketWindow1.start();
        ticketWindow2.start();

    }
}

class TicketWindow extends Thread{
    private static int ticket = 20;

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            show();

        }
    }

    private static synchronized void show(){
        if(ticket > 0){
            ticket--;
            System.out.println("欢迎来到窗口: " + Thread.currentThread().getName() +" 先生请慢走！" + "当前票数剩余：" + ticket);
        }else{
            System.out.println(Thread.currentThread().getName() + "该窗口的票已经卖完，请下次再来！");
        }
    }
}
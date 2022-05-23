import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 本当迷
 * @Description 创建多线程的方式三：实现Callable接口
 * @date 2022/5/23-20:14
 */
public class CallableTest {
    public static void main(String[] args) {
        Call call = new Call();
        FutureTask futureTask = new FutureTask<>(call);
        new Thread(futureTask).start();
        new Thread(futureTask).start();

        try {
            //获取Callable中call方法的返回值
            //get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值。
            Object sum = futureTask.get();
            System.out.println("总和为:" + sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }


    }
}

class Call implements Callable {

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + " : " + i);
                sum += i;
            }
        }
        return sum;
    }
}
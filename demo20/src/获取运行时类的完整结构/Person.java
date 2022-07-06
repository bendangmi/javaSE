package 获取运行时类的完整结构;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-11:32
 */
public class Person extends Creature<String> implements Comparable<String>, MyInterface{
    private String name;
    int age;
    public int id;

    @MyAnnotation("无参构造器")
    public Person() {
        System.out.println("我是空参构造器");
    }

    @MyAnnotation(value = "带参构造器")
    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @MyAnnotation(value = "compareTo比较类")
    @Override
    public int compareTo(String o) {
        return 0;
    }

    @MyAnnotation("显示Info信息")
    @Override
    public void info() {
        System.out.println("Person信息！");
    }

    @MyAnnotation("玩玩具")
    private String display(String play){
        System.out.println("我爱玩" + play + "!");
        return play;
    }

    @MyAnnotation(value = "qq为1474051103")
    private void qq(){
        System.out.println("qq为1474051103");
    }

    private static void showX(){
        System.out.println("本当迷是个大帅逼！");
    }
}

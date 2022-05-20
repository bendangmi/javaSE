/**
 * @author 本当迷
 * @Description
 * @date 2022/5/19-22:12
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.print();

        new del("本当迷 ", 19).printInfo();
    }
    public void print(){
        System.out.println("1122");
    }

    public static class del{
        String name;
        int age;

        public del(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void printInfo(){
            System.out.println("姓名为：" + name + "年龄为：" + age);
        }
    }
}


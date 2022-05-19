import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("本当迷回归");
        Student stu = new Student();
        stu.print();
        login login = new login();
        login.UI();


    }
    public static class Student {
        public void print(){
            System.out.println("博客：https://www.bdmcom.cn");

        }
    }
    public static  class login{
        public void UI(){
            System.out.println("欢迎使用本当迷管理面板");
            while(true){
                System.out.print("请输入账号：");
                Scanner scan = new Scanner(System.in);
                String name = scan.next();
                System.out.print("请输入密码：");
                String passWord = scan.next();
                boolean flag = verify(name, passWord);
                if(!flag){
                    System.out.println("账号密码输入错误！请重新输入！！");
                }else {
                    // 账号密码验证成功后，进入后台管理面板
                    adminUi adminUi = new adminUi();
                    adminUi.Ui();
                    break;
                }

            }

        }
        public boolean verify(String name, String pwd){
            return name.equals("admin") && pwd.equals("Abc123");
        }
    }
    public static class adminUi{
        public void Ui(){
            System.out.println("欢迎来到后台管理面板");
            String name1 = "天下第一帅锅", name2 = "天下第一美人";
            String idCard1 = "1314", idCard2 = "530";

            Test.Husband husband = new Test.Husband(idCard1, name1);
            Test.Wife wife = new Test.Wife(idCard2, name2);
            husband.wife = wife;
            wife.husband = husband;
            husband.print();
            wife.print();
        }
    }



}

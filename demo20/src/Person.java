/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-7:08
 */
public class Person {
    private String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public void showInfo(){
        System.out.println("我爱学习JAVA！");
    }

    private String getPlay(String play){
        System.out.println("我喜欢玩" + play);
        return play;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

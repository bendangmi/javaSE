/**
 * @author 本当迷
 * @Description 实现一个抽象父类
 * @date 2022/5/21-15:28
 */
 public abstract class People {
    private String name; //姓名
    private int age; //年龄

     public abstract void eat();
     public abstract void likePlay();

    public People() {
    }

    public People(String name, int age) {
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
}

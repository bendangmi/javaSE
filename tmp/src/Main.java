/**
 * @author 本当迷
 * @Description
 * @date 2022/6/28-21:45
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("小狗", 12);
        Cat cat = new Cat("小猫", 22);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal){
        animal.play();
        animal.eat();
        animal.showInfoLife();
    }
}

abstract class Animal{
    public int age;
    public String name;

    abstract public void eat();
    abstract public void play();
    abstract public void showInfoLife();

}

class Dog extends Animal{
    private final int life = 1;

    public Dog() {
    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("狗爱吃骨头！");
    }

    @Override
    public void play() {
        System.out.println("狗喜欢睡觉！");
    }

    @Override
    public void showInfoLife() {
        System.out.println("狗有" + life + "条命!");
    }
}

class Cat extends Animal{
    private final int life = 9;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("猫爱吃鱼！");
    }

    @Override
    public void play() {
        System.out.println("猫爱捉老鼠！");
    }

    @Override
    public void showInfoLife() {
        System.out.println("猫有" + life + "条命!");
    }
}

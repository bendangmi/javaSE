/**
 * @author 本当迷
 * @Description 多态练习
 * @date 2022/5/20-12:27
 */
public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat(); // 父类的引用指向子类的对象
        Animal dog = new Dog();
        cat.move();
        dog.move();
        // 当我们想使用子类的方法，必须向下转型，且需要使用instanceof进行判断是否是同一种类
        if(cat instanceof Cat) {
            ((Cat) cat).eat();
        }

        if(dog instanceof Dog) {
            ((Dog) dog).beAfraid();
        }
    }
}

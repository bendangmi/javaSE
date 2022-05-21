/**
 * @author 本当迷
 * @Description 多态练习
 * @date 2022/5/20-13:05
 */
public class Test {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1("二哈");
        Cat1 cat1 = new Cat1("青娘");
        Pension pension = new Pension("本当迷");
        pension.feed(dog1);
        pension.feed(cat1);
    }
    
    
}
class Pension {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pension(String name) {
        this.name = name;
    }

    public void feed (Pet pet){
        System.out.println("开始投喂");
        pet.eat();
        System.out.println("投喂结束");
    }
}

class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat () {
        System.out.println("动物正在吃东西！");
    }
}

class Dog1 extends Pet{
    public Dog1(String name) {
        super(name);

    }

    @Override
    public void eat() {
        System.out.println(getName() + "正在吃东西");
    }
}

class Cat1 extends Pet{
    Cat1(String name) {
        super(name);

    }
    @Override
    public void eat() {
        System.out.println(getName() + "正在吃东西");
    }
}
import java.util.Objects;

public class Person implements Comparable{
    /**
     * Collection接口中声明的方法的测试
     * <p>
     * 结论：
     * 向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals().
     * 刚开始我name使用的是StringBuilder，但是发现重写了Person重写了，remove竟然没有用，然后我创建了两个Person类
     * 发现值相等equals比较返回false，这时我想到他们应该比较的是地址，把StringBuilder换成String就好了，
     * 发现惊天大秘密，StringBuilder没有重写equals
     * String比较的是值
     * StringBuilder比较的是地址
     */
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }


    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person person = (Person) o;
            int com = Integer.compare(this.age, person.getAge());
            if(com != 0){
                return com;
            }else{
                return this.name.compareTo(person.getName());
            }
        }else{
            throw new RuntimeException("输入类型不匹配！");
        }
    }
}

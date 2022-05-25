import java.util.Objects;

public class People implements Comparable {
    private StringBuilder name;
    private int age;

    public StringBuilder getName() {
        return name;
    }

    public People(StringBuilder name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && name.equals(people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof People) {
            People p1 = (People) o;
            if (this.getAge() > p1.getAge()) {
                return 1; // 如果当前对象this大于形参对象obj，则返回正整数，
            } else if (this.getAge() < p1.getAge()) {
                return -1; // 如果当前对象this小于形参对象obj，则返回负整数，
            } else {
                return this.getName().toString().compareTo(p1.getName().toString());
            }
        }
        return 0; // 如果当前对象this等于形参对象obj，则返回零。
    }
}

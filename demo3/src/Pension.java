/**
 * @author 本当迷
 * @Description
 * @date 2022/5/20-9:40
 */
public class Pension {
    private String name; //姓名
    private int age; //年龄
    private String address; //地址
    private String numberPhone; //电话号码

    public Pension() {
    }

    public Pension(String name, int age, String address, String numberPhone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.numberPhone = numberPhone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

}

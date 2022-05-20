/**
 * @author 本当迷
 * @Description
 * @date 2022/5/20-9:43
 */
public class Student extends Pension {
    private String classroom; //所在班级

    public Student() {
    }

    public Student(String name, int age, String address, String numberPhone, String classroom) {
        super(name, age, address, numberPhone);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}

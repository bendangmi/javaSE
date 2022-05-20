/**
 * @author 本当迷
 * @Description
 * @date 2022/5/20-9:43
 */
public class Teacher extends Pension {
    private String office; //办公室
    private String classTaught; //讲课班级

    public String getOffice() {

        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getClassTaught() {
        return classTaught;
    }

    public void setClassTaught(String classTaught) {
        this.classTaught = classTaught;
    }

    public Teacher() {

    }

    public Teacher(String name, int age, String address, String numberPhone, String office, String classTaught) {
        super(name, age, address, numberPhone);
        this.office = office;
        this.classTaught = classTaught;
    }
}

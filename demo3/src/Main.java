/**
 * @author 本当迷
 * @Description 继承练习
 * @date 2022/5/19-22:12
 */
public class Main {
    public static void main(String[] args) {
        // 学生信息
        String studentName = "小明";
        int studentAge = 19;
        String studentAddress = "贵州省";
        String studentNumberPhone = "18685516051";
        String studentClassroom = "信科20-1班";

        //老师信息
        String teacherName = "母老虎";
        int teacherAge = 39;
        String teacherAddress = "湖南省";
        String teacherNumberPhone = "18685516051";
        String teacherClassTaught = "信科20-1班";
        String teacherOffice = "08102";

        Student student = new Student(studentName, studentAge, studentAddress,studentNumberPhone, studentClassroom);
        Teacher teacher = new Teacher(teacherName, teacherAge, teacherAddress, teacherNumberPhone, teacherOffice, teacherClassTaught);
        System.out.println("学生信息如下：");
        System.out.println("姓名：" + student.getName());
        System.out.println("老师信息如下：");
        System.out.println("姓名：" + teacher.getName());
        System.out.println();
    }
}


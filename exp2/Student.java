/**
 * Student
 * 
 * @author 8208-1803-01 匡涂上青
 * @version 1.0
 */
public class Student {

    public static void main(String[] args) {
        var st1 = new Student("0001", "Sam", "male", 19, 90);
        var st2 = new Student("0030", "Marria", "female", 18, 91);
        System.out.println("第一题:");
        st1.PrintInfo();
        st2.PrintInfo();
        System.out.println("第二题:");
        System.out.println("sJava Average: " + (st1.sJava + st2.sJava) / 2);
        System.out.println("第三题:");
        var sts = new Student[5];
        int newNo = 1;
        String[] Name = { "Aom", "Bom", "Com", "Dom", "Eom" };
        String[] Sex = { "male", "female" };
        float avgJava = 0;
        for (Student student : sts) {
            student = new Student("8" + newNo * 54321 % 10000, Name[newNo - 1], Sex[newNo % 2], newNo * 54 % 21,
                    newNo * 54.24f % 100);
            student.PrintInfo();
            avgJava += student.sJava;
            newNo++;
        }
        System.out.println("Average of 5 students: " + avgJava / 5);
    }

    public Student(String _no, String _name, String _sex, int _age, float _java) {
        sNo = _no;
        sName = _name;
        sSex = _sex;
        sAge = _age;
        sJava = _java;
    }

    /**
     * 表示学号
     */
    public String sNo = "";

    /**
     * 表示姓名
     */
    public String sName = "";

    /**
     * 表示性别
     */
    public String sSex = "";

    /**
     * 表示年龄
     */
    public int sAge;

    /**
     * 表示Java课程成绩
     */
    public float sJava;

    /**
     * 获得学号
     */
    public String getNo() {
        return sNo;
    }

    /**
     * 获得姓名
     */
    public String getName() {
        return sName;
    }

    /**
     * 获得性别
     */
    public String getSex() {
        return sSex;
    }

    /**
     * 获得年龄
     */
    public int getAge() {
        return sAge;
    }

    /**
     * 获得Java课程成绩
     */
    public float getJava() {
        return sJava;
    }

    /**
     * 打印
     */
    public void PrintInfo() {
        System.out.println("Info: " + sNo + "\t" + sName + "\t" + sSex + "\t" + sAge + "\t" + sJava);
    }
}

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * IOText
 * 
 * @author 8208-1803-01 匡涂上青
 * @version 1.0
 */
public class IOTest {

    public static void main(String[] args) {
        // prime();
        // checkFile();
        studentInfoOut();
        studentInfoIn();
    }

    /**
     * 求2~200之间的所有素数，将求得的结果保存到PRIME.DAT文件中
     */
    public static void prime() {
        File priFile = new File("PRIME.DAT");
        var priData = new ArrayList<Integer>();
        for (int i = 2; i < 200; i++) {
            int j = 2;
            for (; j < i; j++) {
                if (i % j == 0)
                    break;
            }
            if (j == i) {
                priData.add(i);
            }
        }
        byte[] b = new byte[priData.size()];

        try {
            var outStream = new FileOutputStream(priFile);
            outStream.write(b);
            outStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 检查C盘根目录下CONFIG..SYS文件是否存在，若在则显示该文件的名称和内容。
     */
    public static void checkFile() {
        File ckFile = new File("C:/CONFIG.SYS");
        if (ckFile.exists()) {
            try {
                var inStream = new RandomAccessFile("C:/CONFIG.SYS", "w");
                byte[] b = new byte[(int) inStream.length()];
                inStream.read(b);
                inStream.close();
                System.out.print(new String(b, "UTF-8"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件不存在.");
        }
    }

    /**
     * 输入5个学生的信息（包含学号、姓名、3科成绩），统计各学生的总分，然后将学生信息和统计结果存入二进制数据文件STUDENT.DAT中
     */
    public static void studentInfoOut() {
        StudentInfo.Student[] students = new StudentInfo.Student[] {
                new StudentInfo.Student("A", "1001", 90.f, 89.f, 87.f),
                new StudentInfo.Student("B", "1002", 84.f, 89.f, 86.f),
                new StudentInfo.Student("C", "1003", 94.f, 89.f, 92.f),
                new StudentInfo.Student("D", "1004", 79.f, 80.f, 84.f),
                new StudentInfo.Student("E", "1005", 86.f, 89.f, 92.f) };
        StudentInfo info = new StudentInfo(students);

        try {
            ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("STUDENT.DAT"));
            objOut.writeObject(info);
            objOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 从第（3）题中建立的STUDENT.DAT文件中读取数据，寻找平均分最高的学生，并输出该学生的所有信息
     */
    public static void studentInfoIn() {
        try {
            ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("STUDENT.DAT"));
            var info = (StudentInfo) objIn.readObject();
            float maxGrades = 0f;
            StudentInfo.Student maxStudent = new StudentInfo.Student();
            for (var it : info.totalGrades.keySet()) {
                if (info.totalGrades.get(it) > maxGrades) {
                    maxGrades = info.totalGrades.get(it);
                    maxStudent = it;
                }
            }
            System.out.println("均分最高的学生: " + maxStudent.toString());
            objIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 学生信息统计类
     */
    public static class StudentInfo implements Serializable {

        /**
         *
         */
        private static final long serialVersionUID = -7512334125139492094L;

        /**
         * 学生数组
         */
        public Student[] students;

        /**
         * 总分统计
         */
        public HashMap<Student, Float> totalGrades = new HashMap<Student, Float>();

        public StudentInfo(Student[] _students) {
            students = _students;
            for (Student student : _students) {
                totalGrades.put(student, student.sJava + student.sCsharp + student.sPython);
            }
        }

        /**
         * 学生类
         */
        public static class Student implements Serializable {

            /**
             *
             */
            private static final long serialVersionUID = -545097456202716790L;

            public String Name;
            public String Number;
            public float sJava;
            public float sCsharp;
            public float sPython;

            /**
             * 构造方法
             * 
             * @param _name 姓名
             * @param _num  学号
             * @param _sj   Java成绩
             * @param _sc   C#成绩
             * @param _sp   Python成绩
             */
            public Student(String _name, String _num, float _sj, float _sc, float _sp) {
                Name = _name;
                Number = _num;
                sJava = _sj;
                sCsharp = _sc;
                sPython = _sp;
            }

            public Student() {
                Name = "_name";
                Number = "_number";
                sJava = 0f;
                sCsharp = 0f;
                sPython = 0f;
            }

            public String toString() {
                return "学生: " + Name + ": " + Number + " Java成绩: " + sJava + " C#成绩: " + sCsharp + " Python成绩: "
                        + sPython;
            }

        }
    }
}
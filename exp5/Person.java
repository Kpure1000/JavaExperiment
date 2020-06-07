/**
 * 个人类
 * 
 * @author 8208-1803-01 匡涂上青
 * @version 1.0
 */
public class Person {
    /**
     * 姓名
     */
    private String Name;
    /**
     * 年龄
     */
    private int Age;
    /**
     * 年龄范围
     */
    private final AgeRange ageRange = new AgeRange(1, 150);

    /**
     * 年龄范围类
     */
    public class AgeRange {
        int minAge, maxAge;

        /**
         * 初始化构造
         * 
         * @param _min 年龄最小值
         * @param _max 年龄最大值
         */
        public AgeRange(int _min, int _max) {
            minAge = _min;
            maxAge = _max;
        }

        /**
         * 判定年龄在范围内
         * 
         * @param age 待判定年龄
         * @return 是否
         */
        public boolean Containts(int age) {
            return age >= minAge && age <= maxAge;
        }

        /**
         * 年龄范围toString
         */
        public String toString() {
            return "AgeRange[" + minAge + ", " + maxAge + "]";
        }
    }

    /**
     * 性别
     */
    private String Sex;

    /**
     * 构造
     * 
     * @param _name 姓名
     * @param _age  年龄
     * @param _sex  性别
     */
    public Person(String _name, int _age, String _sex) {
        Name = _name;
        Age = _age;
        Sex = _sex;
    }

    public void setName(String _name) {
        Name = _name;
    }

    public String getName() {
        return Name;
    }

    /**
     * 设置年龄
     * 
     * @param _age 年龄
     */
    public void setAge(int _age) throws IllegalAgeException {
        if (ageRange.Containts(_age)) {
            Age = _age;
        } else {
            throw new IllegalAgeException.OutOfRange("年龄 " + _age + ", 超过范围 " + ageRange.toString());
        }

    }

    public int getAge() {
        return Age;
    }

    public void setSex(String _sex) {
        Sex = _sex;
    }

    public String getSex() {
        return Sex;
    }
}
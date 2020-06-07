/**
 * 研究生类
 * 
 * @author 8208-1803-01 匡涂上青
 * @version 1.0
 */
public class Graduate implements StudentInterface, TeacherInterface {

    @Override
    public void setFee(float _fee) {
        fee = _fee;
    }

    @Override
    public float getFee() {
        return fee;
    }

    @Override
    public void setPay(float payment) {
        income = payment;

    }

    @Override
    public float getPay() {
        return income;
    }

    /**
     * 构造
     * 
     * @param _name   姓名
     * @param _sex    性别
     * @param _age    年龄
     * @param _fee    学费
     * @param _income 收入
     */
    public Graduate(String _name, String _sex, int _age, float _fee, float _income) {
        name = _name;
        sex = _sex;
        age = _age;
        fee = _fee;
        income = _income;
    }

    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 年龄
     */
    private int age;
    /**
     * 学费
     */
    private float fee;
    /**
     * 收入
     */
    private float income;

}
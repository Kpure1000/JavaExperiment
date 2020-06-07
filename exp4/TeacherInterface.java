/**
 * 教师工资管理接口
 * 
 * @author 8208-1803-01 匡涂上青
 * @version 1.0
 */
public interface TeacherInterface {
    /**
     * 设置教师工资
     * 
     * @param payment 金额
     */
    public void setPay(float payment);

    /**
     * 获取教师工资
     * 
     * @return 工资
     */
    public float getPay();
}
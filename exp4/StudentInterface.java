/**
 * 学生学费管理接口
 * 
 * @author 8208-1803-01 匡涂上青
 * @version 1.0
 */
public interface StudentInterface {
    /**
     * 设置学生学费
     * 
     * @param fee 费用
     */
    public void setFee(float fee);

    /**
     * 获取学生学费
     * 
     * @return 学费
     */
    public float getFee();
}
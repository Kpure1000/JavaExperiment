/**
 * junit 测试类
 * 
 * @author 8208-1803-01 匡涂上青
 * @version 1.0
 */
public class junit {
    public static void main(String[] args) {
        // 第一题
        // testShape();
        // 第二题
        testGraduate();
    }

    /**
     * 测试Shape以及其派生类Rectangle和Circle
     */
    public static void testShape() {
        System.out.println("测试: 矩形: 3*4, 圆: 3");
        var rect = new Rectangle(3, 4);
        var circle = new Circle(3);
        System.out.println("矩形面积: " + rect.getArea());
        System.out.println("圆面积: " + circle.getArea());
    }

    /**
     * 测试研究生类 以及 学生学费管理、教师工资管理接口
     */
    public static void testGraduate() {
        System.out.println("测试: 学费: 3000, 收入: 4800");
        var master1 = new Graduate("ZhangSan", "male", 19, 3000, 4800);
        if (master1.getPay() - master1.getFee() < 2000) {
            System.out.println("You need a loan!");
        } else {
            System.out.println("Your income is enough");
        }
    }
}
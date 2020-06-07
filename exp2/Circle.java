/**
 * Circle 根据下面的要求实现圆类Circle。 ① 圆类Circle的成员变量：radius表示圆的半径。 ② 圆类Circle的方法成员：
 * Circle（）：构造方法，将半径置0 Circle（double r）：构造方法，创建Circle对象时将半径初始化为r double
 * getRadius（）：获得圆的半径值 double getPerimeter（）：获得圆的周长 void
 * disp（）：将圆的半径、圆的周长和圆的面积输出到屏幕
 * 
 * @author 8208-1803-01 匡涂上青
 * @version 1.0
 */
public class Circle {
    public static void main(String[] args) {
        var circle = new Circle(3);
        circle.disp();
    }

    double redius;

    /**
     * 构造方法，将半径置0
     */
    Circle() {
        redius = 0;
    }

    /**
     * 构造方法，创建Circle对象时将半径初始化为r
     */
    Circle(double r) {
        redius = r;
    }

    /**
     * 获得圆的半径值
     * 
     * @return 返回double半径
     */
    public double getRadius() {
        return redius;
    }

    /**
     * 获得圆的周长
     * 
     * @return 返回double 周长
     */
    public double getPerimeter() {
        return Math.PI * redius * 2;
    }

    /**
     * 将圆的半径、圆的周长和圆的面积输出到屏幕
     */
    public void disp() {
        System.out.println("半径: " + redius + " 周长: " + getPerimeter() + " 面积: " + getPerimeter() / 2 * redius);
    }

}
/**
 * Circle 圆类 继承自Shape
 * 
 * @author 8208-1803-01 匡涂上青
 * @version 1.0
 */
public class Circle extends Shape {

    /**
     * 半径
     */
    private double redius;

    /**
     * 构造圆
     * 
     * @param _r 半径
     */
    public Circle(double _r) {
        redius = _r;
    }

    /**
     * 获取圆的面积
     */
    @Override
    double getArea() {
        return redius * redius * Math.PI;
    }

}
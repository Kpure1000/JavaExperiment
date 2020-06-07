/**
 * Rectangle 矩形类 继承自Shape
 * 
 * @author 8208-1803-01 匡涂上青
 * @version 1.0
 */
public class Rectangle extends Shape {

    /**
     * 宽和高
     */
    private double width, height;

    /**
     * 构造矩形
     * 
     * @param _w 宽
     * @param _h 高
     */
    public Rectangle(double _w, double _h) {
        width = _w;
        height = _h;
    }

    /**
     * 获取矩形的面积
     */
    @Override
    double getArea() {
        return width * height;
    }

}
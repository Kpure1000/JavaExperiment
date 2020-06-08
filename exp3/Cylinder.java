import java.util.Scanner;

/**
 * 继承圆Circle类，派生圆柱体类Cylinder
 * 
 * @author 8208-1803-01 匡涂上青
 * @version 1.0
 */
public class Cylinder extends Circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入圆柱的半径和高: ");
        var cylinder = new Cylinder(sc.nextDouble(), sc.nextDouble());
        cylinder.disp();
        cylinder.dispVol();
        sc.close();
    }

    /**
     * 圆柱体高
     */
    private double height;

    /**
     * 构造方法
     * 
     * @param r 半径
     * @param h 高
     */
    public Cylinder(double r, double h) {
        redius = r;
        height = h;
    }

    /**
     * 获得圆柱体的高
     * 
     * @return 高
     */
    public double getHeigt() {
        return height;
    }

    /**
     * 获得圆柱体的体积
     * 
     * @return 体积
     */
    public double getVol() {
        return super.getPerimeter() / 2 * redius * height;
    }

    /**
     * 将圆柱体的体积输出到屏幕
     */
    public void dispVol() {
        System.out.println("体积: " + getVol());
    }
}
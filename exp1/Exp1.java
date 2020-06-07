import java.io.IOException;
import java.lang.System;
import java.util.*;

/**
 * Exp1
 * <p>
 * 实验一 简单数据类型和流程控制
 * 
 * @author 8208-1803-01匡涂上青
 * @version 1.0
 */
public class Exp1 {

    public static void main(String[] args) {
        var exp1 = new Exp1();
        // exp1.judgeTriangle();
        // exp1.judgeNumber();
        // exp1.payCaculator();
        // exp1.SumOdd_for();
        // exp1.SumOdd_while();
        exp1.caculator();
    }

    /**
     * 输入
     */
    Scanner sc = new Scanner(System.in);

    /**
     * 判断三角形是否为直角三角形
     */
    public void judgeTriangle() {
        // 输入
        System.out.println("输入三条边：");
        var s1 = sc.nextInt();
        var s2 = sc.nextInt();
        var s3 = sc.nextInt();
        System.out.println("三角形: " + s1 + " " + s2 + " " + s3 + ":");
        if (s1 > 0 && s2 > 0 && s3 > 0) {
            if (s1 * s1 + s2 * s2 == s3 * s3 || s1 * s1 + s3 * s3 == s2 * s2 || s2 * s2 + s3 * s3 == s1 * s1) {
                System.out.println("是直角三角形");
                return;
            }
            System.out.println("不是直角三角形");
        }

    }

    /**
     * 任意从键盘输入一个0到9999之间的数，判断输入的数是几位数
     * <p>
     * 异常检测
     */
    public void judgeNumber() {
        try {
            _judgeNumber();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 任意从键盘输入一个0到9999之间的数，判断输入的数是几位数
     * <p>
     * 内部方法
     */
    private void _judgeNumber() throws IOException {
        var numIn = sc.nextInt();
        if (numIn < 0 || numIn > 9999) {
            System.out.println("输入数字超出范围[0,9999]");
        } else {
            int numNum = 0;
            if (numIn > 0)
                while (numIn > 0) {
                    numIn /= 10;
                    numNum++;
                }
            else
                numNum = 1;
            System.out.println("位数: " + numNum);
        }
    }

    /**
     * 铁路运货的运费与路程远近及货物的重量有关，设有如下的单位运费： 不足100千米，每吨每千米为1.0元 100千米以上，不足300千米，每吨每千米为0.9元
     * 300千米以上，不足500千米，每吨每千米为0.8元 500千米以上，不足1000千米，每吨每千米为0.7元 1000千米以上，每吨每千米为0.6元
     * 编程：对输入的货物重量和路程，计算相应的运费。
     */
    public void payCaculator() {
        System.out.println("输入参数: 重量(t) 距离(km):");
        var weight = sc.nextInt();
        var distance = sc.nextInt();
        float payRate;
        if (distance > 0 && distance < 100) {
            payRate = 1f;
        } else if (distance >= 100 && distance < 300) {
            payRate = .9f;
        } else if (distance >= 300 && distance < 500) {
            payRate = .8f;
        } else if (distance >= 500 && distance < 1000) {
            payRate = .7f;
        } else {
            payRate = .6f;
        }
        System.out.println("运费: " + payRate * weight * distance);
    }

    /**
     * 用循环语句编程：求1~1000之间的偶数之和
     * <p>
     * for版
     */
    public void SumOdd_for() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0)
                sum += i;
        }
        System.out.println("偶数和(for循环): " + sum);
    }

    /**
     * 用循环语句编程：求1~1000之间的偶数之和
     * <p>
     * while版
     */
    public void SumOdd_while() {
        int sum = 0;
        int i = 1;
        while (i <= 1000) {
            if (i % 2 == 0)
                sum += i;
            i++;
        }
        System.out.println("偶数和(while循环): " + sum);
    }

    /**
     * 编程求：1!+2!+3!+……+10!
     */
    public void caculator() {
        int tmp = 1;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j > 1; j--) {
                tmp *= j;
            }
            sum += tmp;
            tmp = 1;
        }
        System.out.println("1!+2!+3!+...+10! = " + sum);
    }
}
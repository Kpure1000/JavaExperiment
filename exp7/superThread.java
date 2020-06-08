import java.util.Random;

/**
 * superThread
 * @author 8208-1803-01 匡涂上青
 * @version 1.0
 */
public class superThread extends Thread {
    public static void main(String[] args) {
        //ch1();
        ch2();
    }

    String Name;

    public superThread() {
        Name = "Thread Name Default.";
    }

    public superThread(String _name) {
        Name = _name;
    }

    /**
     * 
     */
    public void run() {
        System.out.println("Thread: " + Name + " Start...");
        try {
            long delay = Math.abs(new Random().nextLong() % 8000);
            System.out.println("Thread: " + Name + " Sleep for " + delay + "ms");
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread: " + Name + " Exit.");
    }

    /**
     * 用继承Thread类的方法实现一个多线程程序，该程序先后启动三个线程，每个线程首先打印出一条线程创建信息，然后休眠一个随机时间，最后打印出线程结束信息退出
     */
    public static void ch1() {
        var th1 = new superThread("th1");
        var th2 = new superThread("th2");
        var th3 = new superThread("th3");
        th1.start();
        th2.start();
        th3.start();

    }

    /**
     * 第二题
     */
    public static void ch2() {
        /**
         * 在一个线程中求100以内素数，求出后休眠一个随机时间。输出数据时应有提示，指明哪个线程输出的数据
         */
        new Thread(() -> {
            System.out.println("th1 Start，开始求取100内素数");
            for (int i = 1; i < 100; i++) {
                int j = 2;
                for (; j < i; j++) {
                    if (i % j == 0)
                        break;
                }
                if (j == i) {
                    System.out.println("th1: " + i);
                }

            }
            try {
                long delay = Math.abs(new Random().nextLong() % 8000);
                System.out.println("th1 Sleep for " + delay + "ms");
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("th1 Exit.");
        }).start();
        /**
         * 在一个线程中求100以内能被3整除的数，求出后休眠一个随机时间。输出数据时应有提示，指明哪个线程输出的数据
         */
        new Thread(() -> {
            System.out.println("th1 Start，开始求取100内被3整除的数");
            for (int i = 1; i < 100; i++) {
                if (i % 3 == 0) {
                    System.out.println("th2: " + i);
                }
            }
            try {
                long delay = Math.abs(new Random().nextLong() % 8000);
                System.out.println("th2 Sleep for " + delay + "ms");
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("th2 Exit.");
        }).start();
    }

}
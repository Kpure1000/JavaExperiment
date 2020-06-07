/**
 * 单元测试
 * 
 * @author 8208-1803-01 匡涂上青
 * @version 1.0
 */
public class Junit {
    public static void main(String[] args) {
        System.out.println("测试: 设置年龄依次为: 15, 0, 200");

        var person = new Person("Tom", 19, "male");

        try {
            System.out.println("\nsetAge(15):");
            person.setAge(15);
            System.out.println("getAge: " + person.getAge());
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("\nsetAge(0):");
            person.setAge(0);
            System.out.println("getAge: " + person.getAge());
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("\nsetAge(200):");
            person.setAge(200);
            System.out.println("getAge: " + person.getAge());
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }

    }
}
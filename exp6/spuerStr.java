import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * spuerStr
 * 
 * @author 8208-1803-01 匡涂上青
 * @version 1.0
 */
public class spuerStr {

    public static String[] testStr1 = { "abcdefgABCDEFG", "0123456789", "1234554321", "aabbccbbaa", "abcabc123321",
            "User/workspaceStorage/30baf457c17c1964bd3ba330427dc9af/redhat.java", "UTF-8 test: Unicode 中文测试" };

    public static void main(String[] args) {
        var superStr = new spuerStr();
        // for (String item : testStr1) {
        // superStr.ch2(item);
        // }
        // for (String item : testStr) {
        // superStr.ch1(item);
        // }

        // String testRepeat = "ABCDABCDABCD 123412341234 一二三四一二三四一二三四";
        // superStr.ch3(testRepeat, "A");
        // superStr.ch3(testRepeat, "1");
        // superStr.ch3(testRepeat, "一");
        // superStr.ch3(testRepeat, "三四");
        // superStr.ch3(testRepeat, "DB");

        // superStr.removeRepeate();

        // superStr.charFreq("11223344", '2');
        // superStr.charFreq("1122334455", '6');
        // superStr.charFreq("a b c d e", ' ');
        // superStr.charFreq("你好，哈哈哈哈哈", '哈');

        System.out.println("输出: " + superStr.splitStr(1234567890));
        System.out.println("输出: " + superStr.splitStr(982734));
        System.out.println("输出: " + superStr.splitStr(2683488));
        System.out.println("输出: " + superStr.splitStr(269));
    }

    /**
     * 将字符串的大写英文字母改为小写字母，小写字母改为大写字母
     */
    public void ch1(String strIn) {
        System.out.println("输入: " + strIn);
        StringBuffer reStr = new StringBuffer();
        var chStr = strIn.toCharArray();
        for (int i = 0; i < chStr.length; i++) {
            if (chStr[i] >= 'a' && chStr[i] <= 'z') {
                reStr.append(String.valueOf(chStr[i]).toUpperCase());
            } else if (chStr[i] >= 'A' && chStr[i] <= 'Z') {
                reStr.append(String.valueOf(chStr[i]).toLowerCase());
            } else {
                reStr.append(String.valueOf(chStr[i]));
            }
        }
        strIn = reStr.toString();
        System.out.println("输出: " + strIn);
    }

    /**
     * 检查输入的字符串是否是“回文”
     */
    public void ch2(String strIn) {
        System.out.println("输入: " + strIn);
        StringBuffer curStr = new StringBuffer(strIn);
        StringBuffer reStr = new StringBuffer(strIn).reverse();
        System.out.println("cur: " + curStr);
        System.out.println("re: " + reStr);
        if (curStr.toString().equals(reStr.toString())) {
            System.out.println("回文\n");
        } else {
            System.out.println("不回文\n");
        }
    }

    /**
     * 输入两个字符串，从第一个字符串中删除第二个字符串的内容
     */
    public void ch3(String targetStr, String matchStr) {
        boolean isMatched = false;
        System.out.println("\n输入: " + targetStr + " 删除: " + matchStr);
        ArrayList<Character> tarCh = new ArrayList<Character>();
        var tarChTmp = targetStr.toCharArray();
        for (char c : tarChTmp) {
            tarCh.add(c);
        }
        for (int i = 0; i < tarCh.size(); i++) {
            if (tarCh.get(i).equals(matchStr.charAt(0))) {
                // 找到相同开端
                int j = 0;
                for (; i + j < tarCh.size() && j < matchStr.length(); j++) {
                    if (!tarCh.get(i + j).equals(matchStr.charAt(j))) {
                        break;
                    }
                }
                if (j == matchStr.length()) {
                    // 匹配成功
                    isMatched = true;
                    for (--j; j >= 0; j--) {
                        tarCh.remove(i + j);
                    }
                }
            }
        }
        if (isMatched) {
            StringBuffer reBuf = new StringBuffer();
            for (char item : tarCh) {
                reBuf.append(item);
            }
            targetStr = new String(reBuf.toString());
            System.out.println("输出: " + targetStr);
        } else {
            System.out.println("匹配失败, 无法删除");
        }
    }

    /**
     * 从命令行方式输入的字符串中删去所有重复的字符，每种字符只保留一个
     */
    public void removeRepeate() {
        Scanner sc = new Scanner(System.in);
        String strIn = sc.nextLine();

        ArrayList<Character> tarCh = new ArrayList<Character>();
        var tarChTmp = strIn.toCharArray();
        for (char c : tarChTmp) {
            tarCh.add(c);
        }
        HashMap<Character, Object> map = new HashMap<Character, Object>();
        for (int i = 0; i < tarCh.size(); i++) {
            if (map.containsKey(tarCh.get(i))) {
                // 去重
                tarCh.remove(map.get(tarCh.get(i)));
                i--;
            } else {
                // 加入Hash
                map.put(tarCh.get(i), tarCh.get(i));
            }
        }
        StringBuffer reBuf = new StringBuffer();
        for (char item : tarCh) {
            reBuf.append(item);
        }
        System.out.println("去重: " + reBuf.toString());
        sc.close();
    }

    /**
     * 统计一个字符串中给定字符串出现的频率
     * 
     */
    public void charFreq(String tarStr, char target) {
        int Length = tarStr.length();
        int times = 0;
        for (int i = 0; i < Length; i++) {
            if (tarStr.charAt(i) == target) {
                times++;
            }
        }
        System.out.println("字符串 \"" + tarStr + "\" 中, 字符\'" + target + "\' 出现频率: " + times + "/" + Length + "("
                + (double) times / Length + ")");
    }

    /**
     * 将一个表示十进制数的字符串转换为以逗号分隔的字符串，从右边开始每三个数字标一个逗号。例如，给定一个字符串“1234567”，该方法返回“1,234,567”
     */
    public String splitStr(int numIn) {
        System.out.println("\n输入: " + numIn);
        var strIn = Integer.toString(numIn);
        var tarCh = new ArrayList<Character>();
        var tarChTmp = new String(new StringBuffer(strIn).reverse()).toCharArray();
        for (char c : tarChTmp) {
            tarCh.add(c);
        }
        for (int i = 0; i < tarCh.size(); i++) {
            if ((i + 1) % 4 == 0) {
                tarCh.add(i, ',');
            }
        }
        var resultBuffer = new StringBuffer();
        for (char item : tarCh) {
            resultBuffer.append(item);
        }
        return new String(resultBuffer.reverse());
    }
}
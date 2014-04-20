import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Loon
 * Date: 13-4-2
 * Time: 下午10:14
 * To change this template use File | Settings | File Templates.
 */
public class ArraysDemo {
    public static void main(String[] args) {

        // aslist使用
        asList();

        // 复制数组
        copyingArrays();

        //  数组排序
        sort();

        // 查找
        binarySearch();
    }

    public static void copyingArrays() {

        int[] i = new int[7];
        int[] j = new int[10];

        // 插入元素
        Arrays.fill(i, 47);
        Arrays.fill(j, 99);

        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(j));
        // 比较数据
        System.out.println(Arrays.equals(i,j));

        // 复制元素
        System.arraycopy(i,0,j,0,i.length);
        System.out.println(Arrays.toString(j));
    }


    public static void asList() {

        List list = Arrays.asList(1, 2, 3);

        for (Object o : list) {
            System.out.println(o);
        }
    }


    public static void hasCode() {

        Integer[] integer = {4, 5, 6};
        // 生产散列码
        System.out.println(integer.hashCode());
    }

    public static void sort() {

        String[] strings =new String[10];

        for (int i= 0;i<strings.length;i++){
            strings[i] =getRandomString(5);
        }

        System.out.println("Before sort:" + Arrays.toString(strings));
        //  按照词典编排顺序 大写在前
        Arrays.sort(strings,String.CASE_INSENSITIVE_ORDER);
        //  Arrays.sort(strings);
        System.out.println("After sort:" + Arrays.toString(strings));

    }

    public static void binarySearch() {

        String[] strings =new String[10];

        for (int i= 0;i<strings.length;i++){
            strings[i] =getRandomString(5);
        }

        System.out.println(Arrays.toString(strings));

        int index = Arrays.binarySearch(strings,strings[2],String.CASE_INSENSITIVE_ORDER);

        System.out.println(index+"  "+strings[index]);
    }


    // 获取随机字符串
    public static String getRandomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

}

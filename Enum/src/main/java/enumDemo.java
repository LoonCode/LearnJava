/**
 * Created with IntelliJ IDEA.
 * User: Loon
 * Date: 13-3-31
 * Time: 下午3:05
 * To change this template use File | Settings | File Templates.
 */



public class enumDemo {

    public static void main(String[] args) {

        System.out.println(String.valueOf(Week.SAT));
        System.out.println(Week.SAT.ordinal());// 获取枚举实例在声明时的次序，从0开始
        System.out.println(Week.SAT.getChineseName());

        // System.out.println(SAT.ordinal());// 静态导入使用

        for (Week week : Week.values()) {   // 循环遍历枚举
            System.out.println(week.getChineseName()+": "+week.ordinal()+"; EnglishName: "+week);
        }



    }
}

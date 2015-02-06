import java.util.EnumSet;

/**
 * Created by Loon on 2015/2/6.
 */

public class EnumSetExample {

    public static void main(String[] args) {

        EnumSet<Week> weekEnumSet =EnumSet.noneOf(Week.class); // 初始化，创建空对象

        weekEnumSet.add(Week.FRI);
        System.out.println(weekEnumSet);
        weekEnumSet.addAll(EnumSet.of(Week.MON,Week.TUS));
        System.out.println(weekEnumSet);
        weekEnumSet.removeAll(EnumSet.allOf(Week.class));
        System.out.println(weekEnumSet);


    }
}

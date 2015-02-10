import java.util.EnumMap;
import java.util.Map;

/**
 * Created by Loon on 2015/2/9.
 */

interface  Command{
    String getRealName();
}


public class EnumMapExample {

    public static void main(String[] args) {

        EnumMap<Week,Command> enumMap= new EnumMap<Week, Command>(Week.class);

        enumMap.put(Week.MON,new Command() {
            @Override
            public String getRealName() {
                return  Week.MON.getChineseName();
            }
        });


        enumMap.put(Week.FRI,new Command() {
            @Override
            public String getRealName() {
                return  Week.FRI.getChineseName();
            }
        });


        for (Map.Entry<Week, Command> weekCommandEntry : enumMap.entrySet()) {
            System.out.printf("%s: %s%n", weekCommandEntry.getKey(), weekCommandEntry.getValue().getRealName());
        }

    }
}

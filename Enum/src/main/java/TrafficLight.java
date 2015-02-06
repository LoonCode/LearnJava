import com.google.common.base.Objects;

/**
 * thinking in java; page no 1016
 * Created by Loon on 2015/2/6.
 */
enum Signal {
    GREEN, RED, YELLOW
}

public class TrafficLight {
    Signal color = Signal.RED;

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        for (int i = 0; i < 10; i++) {
            System.out.println(light);
            light.change();
        }
    }

    @Override
    public String toString() {
        return "this traffic light is " + color;
    }

    private void change() {
        switch (color) {
            case RED:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
        }
    }
}

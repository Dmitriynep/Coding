package transport;

public class electroBus extends Bus{

    private static int count;

    public electroBus(double engine) {
        super(engine);
        count++;
    }

    public static int getCount() {
        return count;
    }
}

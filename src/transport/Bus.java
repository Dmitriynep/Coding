package transport;

public class Bus {
    private static int count;
    double engine;
    double howMuch;
    public Bus(double engine) {
        this.engine = engine;
        this.howMuch = howMuch;
        count++;
    }

    public double getEngine() {
        return engine;
    }

    public double getHowMuch() {
        return howMuch;
    }

    public static int getCount() {
        return count;
    }

    @Override
     public String toString() {
        return "Bus{" +
                "engine=" + engine +
                ", howMuch=" + howMuch +
                '}';
    }
}

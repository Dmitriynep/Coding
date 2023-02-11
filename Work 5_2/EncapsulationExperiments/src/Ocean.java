public class Ocean {

    public Ocean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public boolean isFreezing() {
        return freezing;
    }

    public void setFreezing(boolean freezing) {
        this.freezing = freezing;
    }

    private String name;
    private double square;
    private boolean freezing;

}

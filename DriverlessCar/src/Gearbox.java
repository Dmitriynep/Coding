public class Gearbox {
    /**
     * 0 - neutral
     * -1 - rear
     * 1-6 -
     */


    private static final int MIN_GEAR = 1;
    private static final int MAX_GEAR = 6;

    public final GearBoxType type;

    public Gearbox(GearBoxType type) {
        this.type = type;
    }

    public GearBoxType getType() {
        return type;
    }

    private int gear = 0;

    public void shiftUp() {
        gear = gear< MAX_GEAR ? gear + 1 : gear;
    }

    public void shiftDown() {
        gear = gear> MIN_GEAR ? gear - 1 : gear;
    }

    public void switchRear() {
        gear = (gear > 1) ? gear : -1;
    }

    public void switchNeutral() {
        gear = 0;
    }

    public int getCurrentGear(){
        return gear;
    }
}

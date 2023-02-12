public class Main {
    public static void main(String[] args) {
        GearBoxType type = GearBoxType.valueOf("ROBOT");
        Gearbox gearbox = new Gearbox(type);

        System.out.println(gearbox.getType());
      //Smth change for Git test2
    }

}

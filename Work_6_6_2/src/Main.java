public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(EngineType.GAS,1.8,200);

        Car car1 = new Car(engine,CarType.SEDAN,1800);

        System.out.println("Тип автомобиля: " + car1.getCarType());
        System.out.println("Масса двигателя: " + car1.getWeight());
        System.out.println("Тип двигателя: " +
                car1.getEngine().getEngineType());
        System.out.println("Объём двигателя: " +
                car1.getEngine().getVolume());
        System.out.println("Мощность двигателя: " +
                car1.getEngine().getPower());


    }
}
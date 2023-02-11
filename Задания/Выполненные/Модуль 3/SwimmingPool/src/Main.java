public class Main {
    public static void main(String[] args) {
        int volume = 1200;

        int fillingSpeed = 30; //30 litres per minute

        int devastationSpeed = 10; //10 litres per minute

        int currentVolume = 0;

        int fillingTime = 0;


        //код без оператора break
//        while (currentVolume < volume) {
//
//            currentVolume = currentVolume + fillingSpeed - devastationSpeed;
//            fillingTime++;
//
//        }

        //код с оператором break, в коде можно было использовать условие currentVolume == volume, но в данном
        //случае при изменении входных значений переменных скорости набора и слива воды легко может возникнуть
        //ситуация в которой вода будет подаваться практически бесконечно (ограничена только max значением int)

        while (true) {

            currentVolume = currentVolume + fillingSpeed - devastationSpeed;
            fillingTime++;
            if (currentVolume >= volume) {
                break;
            }

        }
        System.out.println("SwimmingPool filling time - " + fillingTime + " min");
    }
}
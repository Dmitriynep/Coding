public class Elevator {
    private final int minFloor;
    private final int maxFloor;

    public int currentFloor = 1;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveDown() {
        return currentFloor = currentFloor - 1;
    }

    public int moveUp() {
        return currentFloor = currentFloor + 1;
    }

    public void move(int floor) {

        if (currentFloor > floor && minFloor <= floor) {

            for (int x = currentFloor; x > floor; x = x - 1) {

                moveDown();
                System.out.println(getCurrentFloor());

            }
        } else if (currentFloor < floor && floor <= maxFloor) {

            for (int x = currentFloor; x < floor; x++) {

                moveUp();
                System.out.println(getCurrentFloor());

            }


        } else if (currentFloor == floor) {

        } else {
            System.out.println("! Ошибка !");
        }

    }

}

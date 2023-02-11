public class Main {
    public static void main(String[] args) {
        int vasyaAge = 60; //A
        int katyaAge = 121; //B
        int mishaAge = -5; //C

        int min = -1;
        int middle = -1;
        int max = -1;


        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
        }
        if (katyaAge >= mishaAge) {
            middle = katyaAge;
            min = mishaAge;
        } else {
            middle = mishaAge;
            min = katyaAge;
        }

        if (vasyaAge >= katyaAge && vasyaAge <= mishaAge) {
            max = mishaAge;
            middle = vasyaAge;
            min = katyaAge;
        }

        if (vasyaAge >= mishaAge && katyaAge >= vasyaAge) {
            max = katyaAge;
            middle = vasyaAge;
            min = mishaAge;
        }

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
            if (katyaAge >= mishaAge) {
                max = katyaAge;
                middle = mishaAge;
            } else {
                max = mishaAge;
                middle = katyaAge;
            }
        }


        if (vasyaAge > 120 || vasyaAge < 0 || katyaAge > 120 || katyaAge < 0 || mishaAge > 120 || mishaAge < 0) {
            System.out.println("Заданы некорректные параметры возраста !");
        } else {
            System.out.println("Minimal age: " + min);
            System.out.println("Middle age: " + middle);
            System.out.println("Maximal age: " + max);
        }
    }
}


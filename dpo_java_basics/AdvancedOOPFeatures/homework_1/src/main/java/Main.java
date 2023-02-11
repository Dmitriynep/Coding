import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
        sortBySalaryAndAlphabet(staff);
        System.out.println(staff);
    }

//(e1, e2) -> {
//    int alphabetSorting = e1.getName().compareTo(e2);
//    if (alphabetSorting != 0)
//        return alphabetSorting;
//    return e1.getSalary() - e2.getSalary();
//}
    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        Collections.sort(staff,(o1, o2) -> { int salarySorting = o1.getSalary().compareTo(o2.getSalary());
            if (salarySorting !=0)
                return salarySorting;
            else {
                return o1.getName().compareTo(o2.getName());
            }


                });



        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
    }
}
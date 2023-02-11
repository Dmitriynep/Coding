package scienceParsers;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class Main {



    public static void main(String[] args) throws ParseException {


        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        String dateInString = "7-Jun-2013";
        Date workStart = formatter.parse(dateInString);

        Employee employee = new Employee("Vasya",10000000,workStart);

        System.out.println(employee);
        System.out.println(employee.getName());
    }


}
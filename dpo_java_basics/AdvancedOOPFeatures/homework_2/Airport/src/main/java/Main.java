import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {

        int twoHoursMillis = 7_200_000;
        List<Flight> planesLeavingInTheNextTwoHours = airport.getTerminals().stream().flatMap(terminal ->
                terminal.getFlights().stream().filter(flight -> flight.getType() == Flight.Type.DEPARTURE)
                        .filter(flight -> (flight.getDate().getTime() <= new Date().getTime() + twoHoursMillis)
                                && (flight.getDate().getTime() >= new Date().getTime()))).collect(Collectors.toList());



        return planesLeavingInTheNextTwoHours;
    }

}




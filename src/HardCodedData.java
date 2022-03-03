import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class HardCodedData 
{
	HardCodedFlightclass[] flights;// for flights component

	
	public HardCodedData() 
	{
		  DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	      DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");


	      HardCodedFlightclass departureFlight = new HardCodedFlightclass(
					LocalDate.parse("08/03/2022",dateFormat),
					LocalTime.parse("06:20:00",timeFormat),LocalTime.parse("11:57:00",timeFormat),
					"05:37:00", 7021.04, 179, "HND","Tokyo", "SYD", "Sydney", "TS4977", "Easyplane");
					
	      HardCodedFlightclass returnFlight = new HardCodedFlightclass(
					LocalDate.of(27,03,22), 
					LocalTime.parse("18:23:00"),LocalTime.parse("03:44:00"),
					"09:21:00", 11687.85, 10, "SYD", "Sydney", "HND", "Tokyo", "ST4138", "Eastair");

	      HardCodedFlightclass[] flightTypes = {departureFlight,returnFlight};
			
			flights=flightTypes;
	
	}
	
}



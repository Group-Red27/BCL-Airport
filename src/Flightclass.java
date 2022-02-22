import java.time.LocalDate;

public class Flightclass {

	private LocalDate dateofflight;
	private LocalDate departuretime;
	private LocalDate arrivaltime;
	private LocalDate flightduration;
	private double distance;
	private int delay;
	private LocalDate departdate;
	private LocalDate returndate;
	private String departureairport;
	private String departurecity;
	private String arivalairport;
	private String arrivalcity;
	private String flightnumber;
	private String airline;
	private String returnflight[];
	private String departureflight[];
	
 public LocalDate getdateofflight() {
	 return dateofflight;
	 
 }
	public LocalDate getDeparturetime() {
	return departuretime;
}
public void setDeparturetime(LocalDate departuretime) {
	this.departuretime = departuretime;
}
public LocalDate getArrivaltime() {
	return arrivaltime;
}
public void setArrivaltime(LocalDate arrivaltime) {
	this.arrivaltime = arrivaltime;
}
public LocalDate getFlightduration() {
	return flightduration;
}
public void setFlightduration(LocalDate flightduration) {
	this.flightduration = flightduration;
}
public double getDistance() {
	return distance;
}
public void setDistance(double distance) {
	this.distance = distance;
}
public int getDelay() {
	return delay;
}
public void setDelay(int delay) {
	this.delay = delay;
}
public LocalDate getDepartdate() {
	return departdate;
}
public void setDepartdate(LocalDate departdate) {
	this.departdate = departdate;
}
public LocalDate getReturndate() {
	return returndate;
}
public void setReturndate(LocalDate returndate) {
	this.returndate = returndate;
}
public String getDepartureairport() {
	return departureairport;
}
public void setDepartureairport(String departureairport) {
	this.departureairport = departureairport;
}
public String getDeparturecity() {
	return departurecity;
}
public void setDeparturecity(String departurecity) {
	this.departurecity = departurecity;
}
public String getArivalairport() {
	return arivalairport;
}
public void setArivalairport(String arivalairport) {
	this.arivalairport = arivalairport;
}
public String getArrivalcity() {
	return arrivalcity;
}
public void setArrivalcity(String arrivalcity) {
	this.arrivalcity = arrivalcity;
}
public String getFlightnumber() {
	return flightnumber;
}
public void setFlightnumber(String flightnumber) {
	this.flightnumber = flightnumber;
}
public String getAirline() {
	return airline;
}
public void setAirline(String airline) {
	this.airline = airline;
}
public String[] getReturnflight() {
	return returnflight;
}
public void setReturnflight(String[] returnflight) {
	this.returnflight = returnflight;
}
public String[] getDepartureflight() {
	return departureflight;
}
public void setDepartureflight(String[] departureflight) {
	this.departureflight = departureflight;
}
public void setDateofflight(LocalDate dateofflight) {
	this.dateofflight = dateofflight;
}
	public void setdateofflight(LocalDate dateofflight) {
		this.dateofflight = dateofflight;
	}
	public LocalDate getDateofflight() {
		return dateofflight;
	}
}
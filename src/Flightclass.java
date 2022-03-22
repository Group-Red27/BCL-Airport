import java.time.LocalDate;
import java.time.LocalTime;

public class Flightclass {

	private LocalDate dateofflight;
	private LocalTime departuretime;
	private LocalTime arrivaltime;
	private String flightduration;
	private double distance;
	private int delay;
	private String departureairport;
	private String departurecity;
	private String arivalairport;
	private String arrivalcity;
	private String flightnumber;
	private String airline;
	
	
public LocalDate getdateofflight() {
	 return dateofflight;
	 
 }
	public LocalTime getDeparturetime() {
	return departuretime;
}
public void setDeparturetime(LocalTime localTime) {
	this.departuretime = localTime;
}
public LocalTime getArrivaltime() {
	return arrivaltime;
}
public void setArrivaltime(LocalTime arrivaltime) {
	this.arrivaltime = arrivaltime;
}
public String getFlightduration() {
	return flightduration;
}
public void setFlightduration(String flightduration) {
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


public void setDateofflight(LocalDate dateofflight) {
	this.dateofflight = dateofflight;
}
	public void setdateofflight(LocalDate dateofflight) {
		this.dateofflight = dateofflight;
	}
	public LocalDate getDateofflight() {
		return dateofflight;
	}
	public String getArrivalcity() {
		return arrivalcity;
	}
	public void setArrivalcity(String arrivalcity) {
		this.arrivalcity = arrivalcity;
	}
}
public class Flightclass {

	private DateTime dateofflight;
	private DateTime departuretime;
	private DateTime arrivaltime;
	private DateTime flightduration;
	private double distance;
	private int delay;
	private DateTime departdate;
	private DateTime returndate;
	private String departureairport;
	private String departurecity;
	private String arivalairport;
	private String arrivalcity;
	private String flightnumber;
	private String airline;
	private String returnflight[];
	private String departureflight[];
	
	
 public DateTime getdateofflight() {
	 return dateofflight;
	 
 }
	public void setdateofflight(DateTime dateofflight) {
		this.dateofflight = dateofflight;
	}
	public DateTime getDateofflight() {
		return dateofflight;
	}
	public void setDateofflight(DateTime dateofflight) {
		this.dateofflight = dateofflight;
	}
		public DateTime getDeparturetime() {
		return departuretime;
	}
	public void setDeparturetime(DateTime departuretime) {
		this.departuretime = departuretime;
	}
	public DateTime getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(DateTime arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public DateTime getFlightduration() {
		return flightduration;
	}
	public void setFlightduration(DateTime flightduration) {
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
	public DateTime getDepartdate() {
		return departdate;
	}
	public void setDepartdate(DateTime departdate) {
		this.departdate = departdate;
	}
	public DateTime getReturndate() {
		return returndate;
	}
	public void setReturndate(DateTime returndate) {
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
}
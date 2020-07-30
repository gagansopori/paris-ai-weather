package ai.paris.current.weather.service.model;

public class CurrentWeatherResponseCoordinatesModel {
	
	private Integer lat;
	private Integer lon;
	
	
	public Integer getLat() {
		return lat;
	}
	public void setLat(Integer lat) {
		this.lat = lat;
	}
	public Integer getLon() {
		return lon;
	}
	public void setLon(Integer lon) {
		this.lon = lon;
	}
	
	
	@Override
	public String toString() {
		return "CurrentWeatherResponseCoordinatesModel [lat=" + lat + ", lon=" + lon + "]";
	}
	
	

}

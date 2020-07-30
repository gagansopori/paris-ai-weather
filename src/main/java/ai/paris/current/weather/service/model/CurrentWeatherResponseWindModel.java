package ai.paris.current.weather.service.model;

public class CurrentWeatherResponseWindModel {
	
	private Double speed;
	private Double deg;
	
	
	public Double getSpeed() {
		return speed;
	}
	public void setSpeed(Double speed) {
		this.speed = speed;
	}
	public Double getDeg() {
		return deg;
	}
	public void setDeg(Double deg) {
		this.deg = deg;
	}
	
	@Override
	public String toString() {
		return "CurrentWeatherResponseWindModel [speed=" + speed + ", deg=" + deg + "]";
	}
	
	
	

}

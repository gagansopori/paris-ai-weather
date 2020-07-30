package ai.paris.current.weather.service.model;

import java.math.BigDecimal;

public class CurrentWeatherResponseSystemDataModel {
	
	private Integer type;
	private Integer id;
	private Integer message;
	private String country;
	private Integer sunrise;
	private Integer sunset;
	
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMessage() {
		return message;
	}
	public void setMessage(Integer message) {
		this.message = message;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getSunrise() {
		return sunrise;
	}
	public void setSunrise(Integer sunrise) {
		this.sunrise = sunrise;
	}
	public Integer getSunset() {
		return sunset;
	}
	public void setSunset(Integer sunset) {
		this.sunset = sunset;
	}
	
	@Override
	public String toString() {
		return "CurrentWeatherResponseSystemDataModel [type=" + type + ", id=" + id + ", message=" + message
				+ ", country=" + country + ", sunrise=" + sunrise + ", sunset=" + sunset + "]";
	}
}

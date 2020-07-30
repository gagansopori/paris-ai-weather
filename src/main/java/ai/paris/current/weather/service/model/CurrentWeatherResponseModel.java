package ai.paris.current.weather.service.model;

import java.util.Date;
import java.util.List;



public class CurrentWeatherResponseModel {
	
	public CurrentWeatherResponseCoordinatesModel coord;
	public List<CurrentWeatherResponseWeatherDescriptionModel> weather;
	public CurrentWeatherResponseWindModel wind;
	public CurrentWeatherResponseCloudsModel clouds;
	public CurrentWeatherResponseMainModel main;
	public CurrentWeatherResponseSystemDataModel sys;

	private String base;
	private Integer dt;
	private Integer timezone;
	private Integer id;
	private String name;
	private Integer cod;
	
	
	public CurrentWeatherResponseCoordinatesModel getCoord() {
		return coord;
	}
	public void setCoord(CurrentWeatherResponseCoordinatesModel coord) {
		this.coord = coord;
	}
	public List<CurrentWeatherResponseWeatherDescriptionModel> getWeather() {
		return weather;
	}
	public void setWeather(List<CurrentWeatherResponseWeatherDescriptionModel> weather) {
		this.weather = weather;
	}
	public CurrentWeatherResponseWindModel getWind() {
		return wind;
	}
	public void setWind(CurrentWeatherResponseWindModel wind) {
		this.wind = wind;
	}
	public CurrentWeatherResponseCloudsModel getClouds() {
		return clouds;
	}
	public void setClouds(CurrentWeatherResponseCloudsModel clouds) {
		this.clouds = clouds;
	}
	public CurrentWeatherResponseMainModel getMain() {
		return main;
	}
	public void setMain(CurrentWeatherResponseMainModel main) {
		this.main = main;
	}
	public CurrentWeatherResponseSystemDataModel getSys() {
		return sys;
	}
	public void setSys(CurrentWeatherResponseSystemDataModel sys) {
		this.sys = sys;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public Integer getDt() {
		return dt;
	}
	public void setDt(Integer dt) {
		this.dt = dt;
	}
	public Integer getTimezone() {
		return timezone;
	}
	public void setTimezone(Integer timezone) {
		this.timezone = timezone;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCod() {
		return cod;
	}
	public void setCod(Integer cod) {
		this.cod = cod;
	}
	
	
	@Override
	public String toString() {
		return "CurrentWeatherResponseModel [coord=" + coord + ", weather=" + weather + ", wind=" + wind + ", clouds="
				+ clouds + ", main=" + main + ", sys=" + sys + ", base=" + base + ", dt=" + dt + ", timezone="
				+ timezone + ", id=" + id + ", name=" + name + ", cod=" + cod + "]";
	}
	
	

}




package weatherApp.com.WeatherApp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class City {
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;
    private String city;
    private int temperature;
    private String condition;
    //@ElementCollection
    //public int[] weeklyTemperature;
    private int wind;
    private int humidity;

    public City() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

//    public int[] getWeeklyTemperature() {
//        return weeklyTemperature;
//    }
//
//    public void setWeeklyTemperature(int[] weeklyTemperature) {
//        this.weeklyTemperature = weeklyTemperature;
//    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public City(String city, int temperature, String condition, int wind, int humidity) {
        this.city = city;
        this.temperature = temperature;
        this.condition = condition;
        //this.weeklyTemperature = weeklyTemperature;
        this.wind = wind;
        this.humidity = humidity;
    }
}

package weatherApp.com.WeatherApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class CityController {
    private final CityRepository repository;

    CityController(CityRepository repository){
        this.repository = repository;
    }

    @GetMapping("/cities")
    List<City> all(){
        try{
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return repository.findAll();
    }

    @PostMapping("/cities")
    City newCity(@RequestBody City newCity){
        return repository.save(newCity);
    }

    @PostMapping("/cities/all")
    List<City> saveAll(@RequestBody List<City> cities){
        return repository.saveAll(cities);
    }

}

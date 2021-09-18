package one.digitalinnovation.citiesapi;

import lombok.AllArgsConstructor;
import one.digitalinnovation.citiesapi.entity.Country;
import one.digitalinnovation.citiesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryController {

    private CountryRepository countryRepository;

    @GetMapping()
    public List<Country> getAll() {
        return countryRepository.findAll();
    }
    
}

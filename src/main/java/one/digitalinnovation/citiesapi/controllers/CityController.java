package one.digitalinnovation.citiesapi.controllers;

import lombok.AllArgsConstructor;
import one.digitalinnovation.citiesapi.entities.City;
import one.digitalinnovation.citiesapi.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CityController {

    private CityRepository cityRepository;

    @GetMapping
    public Page<City> getAll(Pageable page) {
        return cityRepository.findAll(page);
    }

}

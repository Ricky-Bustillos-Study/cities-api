package one.digitalinnovation.citiesapi.controllers;

import lombok.AllArgsConstructor;
import one.digitalinnovation.citiesapi.entities.Country;
import one.digitalinnovation.citiesapi.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryController {

    private CountryRepository countryRepository;

    @GetMapping()
    public Page<Country> getAll(Pageable page) {
        return countryRepository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> getById(@PathVariable Long id) {
        Optional<Country> optional = countryRepository.findById(id);

        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}

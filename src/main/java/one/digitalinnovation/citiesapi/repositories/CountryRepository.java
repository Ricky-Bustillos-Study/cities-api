package one.digitalinnovation.citiesapi.repositories;

import one.digitalinnovation.citiesapi.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

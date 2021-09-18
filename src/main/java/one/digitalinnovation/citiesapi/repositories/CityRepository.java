package one.digitalinnovation.citiesapi.repositories;

import one.digitalinnovation.citiesapi.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}

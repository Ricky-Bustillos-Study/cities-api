package one.digitalinnovation.citiesapi.repositories;

import one.digitalinnovation.citiesapi.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

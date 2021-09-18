package one.digitalinnovation.citiesapi.repositories;

import one.digitalinnovation.citiesapi.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CityRepository extends JpaRepository<City, Long> {

    @Query(value = "SELECT ((SELECT lat_lon FROM cidade WHERE id=?1) <@> (SELECT lat_lon FROM cidade WHERE id=?2)) AS distance", nativeQuery = true)
    Double distanceByPoints(final Long city1, final Long city2);

    @Query(value = "SELECT earth_distance(ll_to_earth(?1, ?2), ll_to_earth(?3, ?4)) AS distance", nativeQuery = true)
    Double distanceByCube(final Double x, final Double y, final Double x1, final Double y1);
}

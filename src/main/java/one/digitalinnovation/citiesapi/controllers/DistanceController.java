package one.digitalinnovation.citiesapi.controllers;

import lombok.AllArgsConstructor;
import one.digitalinnovation.citiesapi.services.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DistanceController {

    private DistanceService distanceService;

    @GetMapping("/points")
    public ResponseEntity<Double> byPoints(@RequestParam(name = "from") final Long city1,
                                           @RequestParam(name = "to") final Long city2) {
        return ResponseEntity.ok().body(distanceService.distanceByPointInMiles(city1, city2));
    }

    @GetMapping("/cube")
    public ResponseEntity<Double> byCube(@RequestParam(name = "from") final Long city1,
                                         @RequestParam(name = "to") final Long city2) {
        return ResponseEntity.ok().body(distanceService.distanceByCubeInMeters(city1, city2));
    }

}

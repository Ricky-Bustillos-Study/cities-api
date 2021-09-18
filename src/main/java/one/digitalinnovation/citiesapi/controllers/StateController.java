package one.digitalinnovation.citiesapi.controllers;

import lombok.AllArgsConstructor;
import one.digitalinnovation.citiesapi.entities.State;
import one.digitalinnovation.citiesapi.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StateController {

    private StateRepository stateRepository;

    @GetMapping
    public List<State> getAll() {
        return stateRepository.findAll();
    }


}

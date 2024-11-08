package co.edu.ufps.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ufps.entities.Position;
import co.edu.ufps.services.PositionServices;

@RestController
@RequestMapping("/positions")
public class PositionController {

    @Autowired
    private PositionServices positionServices;
    
    @GetMapping("/{id}")
    public Optional<Position> getPositionById(@PathVariable Integer id) {
        return positionServices.getPositionById(id);
    }
}

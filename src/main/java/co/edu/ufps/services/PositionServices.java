package co.edu.ufps.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ufps.entities.Position;
import co.edu.ufps.repositories.PositionRepository;

@Service
public class PositionServices {

    @Autowired
    private PositionRepository positionRepository;
    
    public Optional<Position> getPositionById(Integer id) {
        return positionRepository.findById(id);
    }
}

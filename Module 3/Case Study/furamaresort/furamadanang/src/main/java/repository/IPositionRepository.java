package repository;

import model.Position;

import java.util.List;

public interface IPositionRepository {

    List<Position> findAll();

    Position findById(Long id);
    
}

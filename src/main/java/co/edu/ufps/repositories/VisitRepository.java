package co.edu.ufps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ufps.entities.Visit;

public interface VisitRepository extends JpaRepository<Visit, Integer> {

}

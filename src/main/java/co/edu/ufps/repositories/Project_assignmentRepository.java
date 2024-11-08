package co.edu.ufps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ufps.entities.Project_assignment;


@Repository
public interface Project_assignmentRepository extends JpaRepository<Project_assignment, Integer> {

}

package co.edu.ufps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ufps.entities.Project;
import co.edu.ufps.services.ProjectServices;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectServices projectServices;

    // Endpoint para crear un proyecto
    @PostMapping
    public ResponseEntity<Project> createProject(Project project) {
        Project createdProject = projectServices.createProject(project);
        return new ResponseEntity<>(createdProject, HttpStatus.CREATED);
    }
}

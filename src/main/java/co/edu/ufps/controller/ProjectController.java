package co.edu.ufps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ufps.entities.Project;
import co.edu.ufps.services.ProjectServices;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectServices projectServices;

    // Endpoint para crear un proyecto usando @RequestParam
    @PostMapping
    public ResponseEntity<Project> createProject(
        @RequestParam String nombre,
        @RequestParam String descripcion,
        @RequestParam String start_date,
        @RequestParam String end_date
    ) {
        // Crear el proyecto a partir de los parámetros recibidos
        Project project = new Project();
        project.setNombre(nombre);
        project.setDescripcion(descripcion);
        project.setStart_date(start_date);
        project.setEnd_date(end_date);

        // Llamada al servicio para guardar el proyecto
        Project createdProject = projectServices.createProject(project);

        return new ResponseEntity<>(createdProject, HttpStatus.CREATED);
    }
}

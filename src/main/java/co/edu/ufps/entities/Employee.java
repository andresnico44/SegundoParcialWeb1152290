package co.edu.ufps.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String first_nombre;
    private String last_nombre;
    private String birthdate;

    @ManyToOne
    @JoinColumn(name = "dep_id")
    private Department dep_id;

    @ManyToOne
    @JoinColumn(name = "pos_id")
    private Position pos_id;

    private String entry_date;

    @OneToMany(mappedBy = "chief_id", cascade = CascadeType.ALL)
    @JsonIgnore
    List<Department> department;

    @OneToMany(mappedBy = "employee_id", cascade = CascadeType.ALL)
    @JsonIgnore
    List<Visit> visit;

    @OneToMany(mappedBy = "employee_id", cascade = CascadeType.ALL)
    @JsonIgnore
    List<Project_assignment> project_assignment;
}


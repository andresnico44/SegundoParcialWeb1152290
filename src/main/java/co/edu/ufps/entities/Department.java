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
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    @OneToMany(mappedBy = "department_id", cascade = CascadeType.ALL)
    @JsonIgnore
    List<Visit> visit;

    @OneToMany(mappedBy = "dep_id", cascade = CascadeType.ALL)
    @JsonIgnore
    List<Employee> employee;

    @ManyToOne
    @JoinColumn(name = "chief_id")
    private Employee chief_id;
}

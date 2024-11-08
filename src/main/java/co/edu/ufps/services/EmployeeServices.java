package co.edu.ufps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ufps.entities.Employee;
import co.edu.ufps.repositories.EmployeeRepository;

@Service
public class EmployeeServices {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
 // Método para actualizar un empleado
    public Employee updateEmployee(Integer id, Employee employeeDetails) {
        // Primero se busca el empleado por su ID
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Empleado no encontrado"));

        // Actualizar los atributos del empleado con los detalles proporcionados
        existingEmployee.setFirst_nombre(employeeDetails.getFirst_nombre());
        existingEmployee.setLast_nombre(employeeDetails.getLast_nombre());
        existingEmployee.setBirthdate(employeeDetails.getBirthdate());
        existingEmployee.setDep_id(employeeDetails.getDep_id());
        existingEmployee.setPos_id(employeeDetails.getPos_id());
        existingEmployee.setEntry_date(employeeDetails.getEntry_date());

        // Guardar el empleado actualizado
        return employeeRepository.save(existingEmployee);
    }
}

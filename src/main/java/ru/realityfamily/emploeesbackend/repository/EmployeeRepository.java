package ru.realityfamily.emploeesbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.realityfamily.emploeesbackend.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}

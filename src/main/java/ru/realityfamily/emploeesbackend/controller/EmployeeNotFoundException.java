package ru.realityfamily.emploeesbackend.controller;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not found employee "+ id);
    }
}

package service;

import model.Employee;

import java.util.List;

public interface IEmployeeService {

    void save(Employee employee);

    List<Employee> findAll();

    Employee findById(Long id);

    void update(Long id, Employee employee);

    void remove(Long id);

    List<Employee> search(String txtSearch);

}
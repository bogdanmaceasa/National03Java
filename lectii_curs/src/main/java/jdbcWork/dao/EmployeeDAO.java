package jdbcWork.dao;


import jdbcWork.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    void insertEmployee(Employee employee);
    void findEmployeeByName(String name);
    void delete(Employee employee);


}

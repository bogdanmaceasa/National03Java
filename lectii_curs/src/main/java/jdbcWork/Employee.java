package jdbcWork;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDate;


@AllArgsConstructor
@Builder
public class Employee {
    private String job;
    private String name;
    private int employeeNo;
    private int employeeManager;
    private int employeeSalary;
    private int employeeComm;
    private int employeeDepartmentNo;
    private LocalDate hireDate;




}

package jdbcWork.dao;

import jdbcWork.Employee;
import org.apache.commons.lang3.ArrayUtils;

import java.sql.*;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public List<Employee> findAll() {

        try (Connection connection = getConnection()){

            String sqlStatement = "SELECT * FROM EMP";
            PreparedStatement preparedStatement =  connection.prepareStatement(sqlStatement);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Employee employee = Employee.builder()
                        .employeeNo(resultSet.getInt("EMPNO"))
                        .employeeSalary(resultSet.getInt("SAL"))
                        .name(resultSet.getString("NAME"))
                        .job(resultSet.getString("JOB"))
                        .build();
                List<Employee> employeeList = new List<Employee>();
                employeeList.add(employee);
                System.out.println(resultSet.getString("ENAME"));
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    private Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306:hr", "root", "Maciuca1988#");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    return null;
    }


    @Override
    public void insertEmployee(Employee employee) {

    }

    @Override
    public void findEmployeeByName(String name) {

    }

    @Override
    public void delete(Employee employee) {

    }
}

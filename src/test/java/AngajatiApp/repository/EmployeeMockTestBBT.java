package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.controller.EmployeeController;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeMockTestBBT {
    EmployeeMock employeeMock;

    @BeforeEach
    void Setup() {
        employeeMock = new EmployeeMock();
    }

    @Test
    void addEmployee_TC01() {
        Employee employee = new Employee();
        employee.setId(5);
        employee.setLastName("Pop");
        employee.setFirstName("Diana");
        employee.setCnp("2900515310004");
        employee.setFunction(DidacticFunction.LECTURER);
        employee.setSalary(4500);

        boolean bool = employeeMock.addEmployee(employee);
        assertTrue(bool, "true");
    }


    @Test
    void addEmployee_TC02() {
        Employee employee1 = new Employee();
        employee1.setId(3);
        employee1.setLastName("Pop");
        employee1.setFirstName("Diana");
        employee1.setCnp("290051510004");
        employee1.setFunction(DidacticFunction.LECTURER);
        employee1.setSalary(4500d);

        boolean bool = employeeMock.addEmployee(employee1);
        assertFalse(bool, "false");
    }

    @Test
    void addEmployee_TC03() {
        Employee employee2 = new Employee();
        employee2.setId(3);
        employee2.setLastName("Morar");
        employee2.setFirstName("89477");
        employee2.setCnp("1930530314006");
        employee2.setFunction(DidacticFunction.ASISTENT);
        employee2.setSalary(3000d);

        boolean bool = employeeMock.addEmployee(employee2);
        assertFalse(bool, "false");
    }

    @Test
    void addEmployee_TC04() {
        Employee employee3 = new Employee();
        employee3.setId(3);
        employee3.setLastName("Pop");
        employee3.setFirstName("Andrei");
        employee3.setCnp("1900208315006");
        employee3.setFunction(DidacticFunction.TEACHER);
        employee3.setSalary(5500d);

        boolean bool = employeeMock.addEmployee(employee3);
        assertTrue(bool, "true");
    }

    @Test
    void addEmployee_TC05() {
        Employee employee4 = new Employee();
        employee4.setFunction(null);
        employee4.setId(3);
        employee4.setLastName("Pop");
        employee4.setFirstName("Andrei");
        employee4.setCnp("1900208315006");
//        employee4.setFunction(DidacticFunction);
        employee4.setSalary(5500d);

        boolean bool = employeeMock.addEmployee(employee4);
        assertFalse(bool, "false");
    }

    @Test
    void addEmployee_TC06() {
        Employee employee5 = new Employee();
        employee5.setId(3);
        employee5.setLastName("Pop");
        employee5.setFirstName("");
        employee5.setCnp("1900208315006");
        employee5.setFunction(DidacticFunction.LECTURER);
        employee5.setSalary(4500d);

        boolean bool = employeeMock.addEmployee(employee5);
        assertFalse(bool, "false");
    }

    @Test
    void addEmployee_TC07() {
        Employee employee6 = new Employee();
        employee6.setId(3);
        employee6.setLastName("Pop");
        employee6.setFirstName("Diana");
        employee6.setCnp("290051510004");
        employee6.setFunction(DidacticFunction.LECTURER);
        employee6.setSalary(4500d);

        boolean bool = employeeMock.addEmployee(employee6);
        assertFalse(bool, "false");
    }

    @Test
    void addEmployee_TC08() {
        Employee employee7 = new Employee();
        employee7.setId(3);
        employee7.setLastName("Morar");
        employee7.setFirstName("Ma");
        employee7.setCnp("2900515310004");
        employee7.setFunction(DidacticFunction.ASISTENT);
        employee7.setSalary(3000d);

        boolean bool = employeeMock.addEmployee(employee7);
        assertTrue(bool, "true");
    }
}
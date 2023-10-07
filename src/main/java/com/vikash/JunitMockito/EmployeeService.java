package com.vikash.JunitMockito;

import java.util.List;

public interface EmployeeService
{
    public Employee createUser(Employee employee);
    public List<Employee> getAllUser();
    public Employee getByNames(String name);

}

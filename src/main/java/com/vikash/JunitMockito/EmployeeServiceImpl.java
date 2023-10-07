package com.vikash.JunitMockito;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
    EmployeeRepository erepo;

    @Override
    public Employee createUser(Employee employee) {
        return erepo.save(employee);
    }

    @Override
    public List<Employee> getAllUser() {
        return erepo.findAll();
    }

    @Override
    public Employee getByNames(String name) {
        return erepo.getByName(name);
    }
}

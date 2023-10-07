package com.vikash.JunitMockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/junit")
public class EmployeeController
{
    @Autowired
    EmployeeService eserv;

    @PostMapping
    public Employee saveUser(@RequestBody Employee employee)
    {
        return eserv.createUser(employee);
    }
    @GetMapping
    public List<Employee> findAll()
    {
        return eserv.getAllUser();
    }
}

package com.vikash.JunitMockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest
{
    @Mock
    EmployeeRepository erepo;

    EmployeeService eserv;

    @BeforeEach
    void setUp()
    {
        this.eserv=new EmployeeServiceImpl(this.erepo);
    }

    @Test
    void findAllEmployee()
    {
        eserv.getAllUser();

        verify(erepo).findAll();
    }

}

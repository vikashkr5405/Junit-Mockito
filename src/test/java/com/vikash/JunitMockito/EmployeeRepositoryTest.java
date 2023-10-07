package com.vikash.JunitMockito;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class EmployeeRepositoryTest
{
    @Autowired
    EmployeeRepository erepo;

    @Test
    void isPersonExistById()
    {
        Boolean actualResult=erepo.isPersonExistsById(2);

        assertThat(actualResult).isTrue();

    }

    @AfterEach

    void tearDown()
    {
        System.out.println("tearing down");
        //prepo.deleteAll();
    }

    @BeforeEach

    void tearUp()
    {
        System.out.println("tearing up");
        //prepo.deleteAll();
    }

}

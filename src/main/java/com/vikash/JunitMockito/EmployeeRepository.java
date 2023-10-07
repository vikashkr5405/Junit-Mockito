package com.vikash.JunitMockito;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
    @Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Employee s WHERE s.id =:id ")
    Boolean isPersonExistsById(Integer id);

    public Employee getByName(String name);
}

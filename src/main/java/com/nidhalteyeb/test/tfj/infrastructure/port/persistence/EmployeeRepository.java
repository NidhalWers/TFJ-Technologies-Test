package com.nidhalteyeb.test.tfj.infrastructure.port.persistence;

import com.nidhalteyeb.test.tfj.infrastructure.port.persistence.jpa.DBEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<DBEmployee, Integer> {
}

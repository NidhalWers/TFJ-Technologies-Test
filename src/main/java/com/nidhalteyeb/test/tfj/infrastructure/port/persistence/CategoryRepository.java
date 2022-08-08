package com.nidhalteyeb.test.tfj.infrastructure.port.persistence;

import com.nidhalteyeb.test.tfj.infrastructure.port.persistence.jpa.DBCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<DBCategory, Integer> {
}

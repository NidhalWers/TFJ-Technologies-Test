package com.nidhalteyeb.test.tfj.infrastructure.port.persistence;

import com.nidhalteyeb.test.tfj.infrastructure.port.persistence.jpa.DBMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MaterialRepository extends JpaRepository<DBMaterial, Integer> {

    @Query(value = " Select m.name, COUNT(m.name) FROM Material AS m GROUP BY m.name" )
    List<Object[]> countMaterialInInventory();

}

package com.nidhalteyeb.test.tfj.infrastructure.port.persistence;

import com.nidhalteyeb.test.tfj.infrastructure.port.persistence.jpa.DBInventory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InventoryRepository extends JpaRepository<DBInventory, Integer> {
}

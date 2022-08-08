package com.nidhalteyeb.test.tfj.infrastructure.port.persistence;

import com.nidhalteyeb.test.tfj.infrastructure.port.persistence.jpa.DBShop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<DBShop, Integer> {
}

package com.nidhalteyeb.test.tfj.api;

import com.nidhalteyeb.test.tfj.infrastructure.port.persistence.ShopRepository;
import com.nidhalteyeb.test.tfj.infrastructure.port.persistence.jpa.DBShop;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopRestController {

    private final ShopRepository repository;

    public ShopRestController(ShopRepository repository) {
        this.repository = repository;
    }

    @PostMapping(value = "/api/v1/inventory",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public DBShop newInventory(@RequestBody DBShop inventory) {
        return repository.save(inventory);
    }
}

package com.nidhalteyeb.test.tfj.api;

import com.nidhalteyeb.test.tfj.infrastructure.port.persistence.EmployeeRepository;
import com.nidhalteyeb.test.tfj.infrastructure.port.persistence.jpa.DBEmployee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {

    private final EmployeeRepository repository;

    public EmployeeRestController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @PostMapping(value = "/api/v1/inventory",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public DBEmployee newInventory(@RequestBody DBEmployee inventory) {
        return repository.save(inventory);
    }

}

package com.nidhalteyeb.test.tfj.api;

import com.nidhalteyeb.test.tfj.infrastructure.port.persistence.CategoryRepository;
import com.nidhalteyeb.test.tfj.infrastructure.port.persistence.jpa.DBCategory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nidhal TEYEB
 * @since 0.0.1
 */
@RestController
public class CategoryRestController {

    private final CategoryRepository repository;

    public CategoryRestController(CategoryRepository repository) {
        this.repository = repository;
    }

    @PostMapping(value = "/api/v1/inventory",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public DBCategory newInventory(@RequestBody DBCategory inventory) {
        return repository.save(inventory);
    }

}

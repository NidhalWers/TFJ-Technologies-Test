package com.nidhalteyeb.test.tfj.api;

import com.nidhalteyeb.test.tfj.api.error.exceptions.ErrorCode;
import com.nidhalteyeb.test.tfj.api.error.exceptions.IllegalPayloadArgumentException;
import com.nidhalteyeb.test.tfj.infrastructure.port.persistence.MaterialRepository;
import com.nidhalteyeb.test.tfj.infrastructure.port.persistence.jpa.DBMaterial;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Nidhal TEYEB
 * @since 0.0.1
 */
@RestController
public class MaterialRestController {

    private final MaterialRepository repository;

    public MaterialRestController(final MaterialRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/v1/material")
    public List<DBMaterial> allMaterials() {
        return repository.findAll();
    }

    @PostMapping(value = "/api/v1/material",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public DBMaterial newInventory(@RequestBody DBMaterial material) {
        return repository.save(material);
    }

    @GetMapping("/api/v1/material/{id}")
    public DBMaterial getInventory(@PathVariable Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalPayloadArgumentException(ErrorCode.INVALID_PARAMETER, "id = " + id));
    }

    @DeleteMapping("/api/v1/material/{id}")
    public void deleteInventory(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @PutMapping("/api/v1/material/{id}")
    public DBMaterial updateInventory(@RequestBody DBMaterial material, @PathVariable Integer id) {
        return repository.findById(id)
                .map(materialFound -> {
                    materialFound.setName(material.getName());
                    materialFound.setDescription(material.getDescription());
                    materialFound.setBrand(material.getBrand());
                    materialFound.setImageUrl(material.getImageUrl());
                    materialFound.setRentalDuration(material.getRentalDuration());
                    materialFound.setRentalCost(material.getRentalCost());
                    materialFound.setReplacementCost(material.getReplacementCost());
                    materialFound.setCategoryId(material.getCategoryId());
                    materialFound.setUpdatedAt(LocalDateTime.now());
                    return repository.save(materialFound);
                })
                .orElseGet(() -> {
                    material.setId(id);
                    return repository.save(material);
                });
    }

    @GetMapping("/api/v1/material/count")
    public List<Object[]> countMaterialInInventory(){
        return repository.countMaterialInInventory();
    }
}

package com.nidhalteyeb.test.tfj.api;

import com.nidhalteyeb.test.tfj.api.error.exceptions.ErrorCode;
import com.nidhalteyeb.test.tfj.api.error.exceptions.IllegalPayloadArgumentException;
import com.nidhalteyeb.test.tfj.infrastructure.port.persistence.InventoryRepository;
import com.nidhalteyeb.test.tfj.infrastructure.port.persistence.jpa.DBInventory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Nidhal TEYEB
 * @since 0.0.1
 */
@RestController
public class InventoryRestController {

    private final InventoryRepository repository;

    public InventoryRestController(final InventoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/v1/inventory")
    public List<DBInventory> allInventories() {
        return repository.findAll();
    }

    @PostMapping(value = "/api/v1/inventory",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public DBInventory newInventory(@RequestBody DBInventory inventory) {
        return repository.save(inventory);
    }

    @GetMapping("/api/v1/inventory/{id}")
    public DBInventory getInventory(@PathVariable Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalPayloadArgumentException(ErrorCode.INVALID_PARAMETER, "id = " + id));
    }

    @DeleteMapping("/api/v1/inventory/{id}")
    public void deleteInventory(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @PutMapping("/api/v1/inventory/{id}")
    public DBInventory updateInventory(@RequestBody DBInventory inventory, @PathVariable Integer id) {
        return repository.findById(id)
                .map(inventoryFound -> {
                    inventoryFound.setMaterialId(inventory.getMaterialId());
                    inventoryFound.setShopId(inventory.getShopId());
                    inventoryFound.setUpdatedAt(LocalDateTime.now());
                    return repository.save(inventoryFound);
                })
                .orElseGet(() -> {
                    inventory.setId(id);
                    return repository.save(inventory);
                });
    }

}
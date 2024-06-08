package com.kurve.invetory.service.controller;

import com.kurve.invetory.service.models.Inventory;
import com.kurve.invetory.service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@RequestParam String skuCode, Integer quantity)
    {
        return inventoryService.isInStock(skuCode, quantity);
    }

    @GetMapping("/skuCode")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Inventory> getInventoryBySkuCode(@RequestParam String skucode)
    {
        return inventoryService.findBySkuCode(skucode);
    }

}

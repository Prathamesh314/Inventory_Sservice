package com.kurve.invetory.service.service;

import com.kurve.invetory.service.models.Inventory;
import com.kurve.invetory.service.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode, Integer quantity)
    {
        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }

    public Optional<Inventory> findBySkuCode(String skuCode)
    {
        return inventoryRepository.findBySkuCode(skuCode);
    }

}

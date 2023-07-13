package com.assement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.assement.assement33.entiies.Item;
import com.assement.dto.ItemDTO;
import com.assement.repository.ItemRepository;

@RestController
@RequestMapping("/api/item")
public class ItemRestController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @PostMapping
    public void saveItem(@RequestBody Item item) {
        itemRepository.save(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItemById(@PathVariable("id") long id) {
        itemRepository.deleteById(id);
    }

    @PutMapping
    public void updateItem(@RequestBody ItemDTO itemDto) {
        Optional<Item> optionalItem = itemRepository.findById(itemDto.getId());
        if (optionalItem.isPresent()) {
            Item item = optionalItem.get();
            item.setName(itemDto.getName());
            item.setCategory(itemDto.getCategory());
            item.setQuantity(itemDto.getQuantity());
            item.setStatus(itemDto.getStatus());
            itemRepository.save(item);
        }
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable("id") long id) {
        Optional<Item> optionalItem = itemRepository.findById(id);
        return optionalItem.orElse(null);
    }
}
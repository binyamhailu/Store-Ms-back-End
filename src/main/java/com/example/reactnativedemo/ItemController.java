package com.example.reactnativedemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class ItemController {

    private final ItemRepository itemRepository ;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Item>> getAllItems() {
        return ResponseEntity.ok(itemRepository.findAll()) ;
    }

    @GetMapping("/all/statusAccepted")
    public ResponseEntity<List<Item>> getAllByItemStatusAccepted() {
        return ResponseEntity.ok(itemRepository.findAllByItemStatus(ItemStatus.ACCEPTED)) ;
    }

    @PostMapping("/add")
    public Item createAnItem(@RequestBody Item item) {
        item.setCreatedDate(new Date());
        item.setItemStatus(ItemStatus.PENDING);
        return itemRepository.save(item) ;
    }
    @PatchMapping("/update/{id}")
    public Item UpdateAcceptStatusItem(@PathVariable String id) {
        Optional<Item> item1 = itemRepository.findById(id) ;
        if (item1.isPresent()) {

        item1.get().setItemStatus(ItemStatus.ACCEPTED);
        item1.get().setApprovedDate(new Date());
        return itemRepository.save(item1.get()) ;
        }
        return null ;
    }
    @PatchMapping("/update/reject/{id}")
    public Item UpdateRejectStatusItem(@PathVariable String id) {
        Optional<Item> item1 = itemRepository.findById(id) ;
        if (item1.isPresent()) {

            item1.get().setItemStatus(ItemStatus.REJECTED);
            item1.get().setRejectedDate(new Date());
            return itemRepository.save(item1.get()) ;
        }
        return null ;
    }



}

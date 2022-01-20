package com.example.reactnativedemo.repository;

import com.example.reactnativedemo.model.Item;
import com.example.reactnativedemo.model.ItemStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends MongoRepository<Item,String> {

    List<Item> findAllByItemStatus(ItemStatus itemStatus);
}

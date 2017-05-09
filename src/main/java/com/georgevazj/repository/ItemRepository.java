package com.georgevazj.repository;

import com.georgevazj.entity.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by jorge on 09/05/2017.
 */

@RepositoryRestResource(collectionResourceRel = "items", path = "items")
public interface ItemRepository extends MongoRepository<Item, String> {

    public List<Item> findByName(@Param("name") String name);

}

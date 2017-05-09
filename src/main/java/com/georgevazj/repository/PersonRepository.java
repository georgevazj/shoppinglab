package com.georgevazj.repository;

import com.georgevazj.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by jorge on 09/05/2017.
 */

@RepositoryRestResource(collectionResourceRel = "persons", path = "persons")
public interface PersonRepository extends MongoRepository<Person, String> {

    public List<Person> findBysurname1(@Param("surname1") String surname1);

}

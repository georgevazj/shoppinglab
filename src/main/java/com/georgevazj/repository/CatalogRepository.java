package com.georgevazj.repository;

import com.georgevazj.entity.Catalog;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by jorge on 09/05/2017.
 */

@RepositoryRestResource(collectionResourceRel = "catalog", path = "catalog")
public interface CatalogRepository {

    public Catalog findByName(@Param("name") String name);

}

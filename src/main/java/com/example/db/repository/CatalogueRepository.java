package com.example.db.repository;

import com.example.db.model.Catalogue.Catalogue;
import com.example.db.model.Catalogue.CatalogueCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CatalogueRepository extends JpaRepository<Catalogue, CatalogueCompositeKey> {
//
//    @Query(value="select * from catalogue",nativeQuery = true)
//    List<Catalogue> findAllCatalogues();
}

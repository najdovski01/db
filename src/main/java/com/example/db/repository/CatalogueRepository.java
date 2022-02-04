package com.example.db.repository;

import com.example.db.model.Catalogue.Catalogue;
import com.example.db.model.Catalogue.CatalogueCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogueRepository extends JpaRepository<Catalogue, CatalogueCompositeKey> {
}

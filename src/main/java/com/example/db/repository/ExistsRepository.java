package com.example.db.repository;

import com.example.db.model.Exists.Exists;
import com.example.db.model.Exists.ExistsCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExistsRepository extends JpaRepository<Exists, ExistsCompositeKey> {
}
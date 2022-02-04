package com.example.db.repository;

import com.example.db.model.WorksAs.WorksAs;
import com.example.db.model.WorksAs.WorksAsCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorksAsRepository extends JpaRepository<WorksAs, WorksAsCompositeKey> {
}

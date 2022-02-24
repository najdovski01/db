package com.example.db.repository;

import com.example.db.model.WorksAs.WorksAs;
import com.example.db.model.WorksAs.WorksAsCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorksAsRepository extends JpaRepository<WorksAs, WorksAsCompositeKey> {


}
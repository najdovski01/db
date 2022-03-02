package com.example.db.repository;

import com.example.db.model.OnlineStores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface OnlineStoresRepository extends JpaRepository<OnlineStores, Integer> {

    Optional<OnlineStores> findById(Integer id);

    List<OnlineStores> findByNames(String names);

    List<OnlineStores> findBySocialMedia(String socialMedia);

    boolean existsById(Integer id);

    List<OnlineStores> findOnlineStoresByWebAddress(String webAddress);
}
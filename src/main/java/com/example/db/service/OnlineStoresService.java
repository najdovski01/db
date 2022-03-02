package com.example.db.service;

import com.example.db.model.OnlineStores;

import java.util.List;
import java.util.Optional;

public interface OnlineStoresService {
    OnlineStores findByStoreId(Integer id);
    List<OnlineStores> findBySocialMedia(String socialMedia);
    List<OnlineStores> findByNames(String names);
    List<OnlineStores> listAll();
}

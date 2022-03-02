package com.example.db.service.impl;

import com.example.db.exceptions.InvalidArgumentsException;
import com.example.db.model.OnlineStores;
import com.example.db.repository.OnlineStoresRepository;
import com.example.db.service.OnlineStoresService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnlineStoresServiceImpl implements OnlineStoresService {

    private final OnlineStoresRepository onlineStoresRepository;

    public OnlineStoresServiceImpl(OnlineStoresRepository onlineStoresRepository) {
        this.onlineStoresRepository = onlineStoresRepository;
    }

    @Override
    public OnlineStores findByStoreId(Integer id) {
        return this.onlineStoresRepository.findById(id).orElseThrow(InvalidArgumentsException::new);
    }

    @Override
    public List<OnlineStores> findBySocialMedia(String socialMedia) {
        if(socialMedia == null || socialMedia.isEmpty()){
            throw new InvalidArgumentsException();
        }
        return this.onlineStoresRepository.findBySocialMedia(socialMedia);
    }

    @Override
    public List<OnlineStores> findByNames(String names) {
        if(names == null || names.isEmpty()){
            throw new InvalidArgumentsException();
        }

        return this.onlineStoresRepository.findByNames(names);
    }

    @Override
    public List<OnlineStores> listAll() {
        return this.onlineStoresRepository.findAll();
    }
}

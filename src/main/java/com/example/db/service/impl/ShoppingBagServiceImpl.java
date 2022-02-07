package com.example.db.service.impl;

import com.example.db.model.Client.Client;
import com.example.db.model.Client.ClientCompositeKey;
import com.example.db.model.ShoppingBag;
import com.example.db.model.User;
import com.example.db.repository.ClientRepository;
import com.example.db.repository.ShoppingBagRepository;
import com.example.db.repository.UserRepository;
import com.example.db.service.ShoppingBagService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShoppingBagServiceImpl implements ShoppingBagService {

    private final ShoppingBagRepository shoppingBagRepository;
    private final UserRepository userRepository;
    private final ClientRepository clientRepository;

    public ShoppingBagServiceImpl(ShoppingBagRepository shoppingBagRepository, UserRepository userRepository, ClientRepository clientRepository) {
        this.shoppingBagRepository = shoppingBagRepository;
        this.userRepository = userRepository;
        this.clientRepository = clientRepository;
    }


    @Override
    public Optional<ShoppingBag> findAll() {
        return this.shoppingBagRepository.findAllShoppingBags();
    }
    @Override
    public Optional<ShoppingBag> save(Integer shopping_id, String order_date, String shipping_date, String modified, Integer user_id) {
        User user = this.userRepository.findById(Integer.valueOf(user_id)).get();
        ClientCompositeKey clientCompositeKey = new ClientCompositeKey();
        clientCompositeKey.setUser(user);
             Client client = this.clientRepository.findById(clientCompositeKey).get();
             return null;
             }
}

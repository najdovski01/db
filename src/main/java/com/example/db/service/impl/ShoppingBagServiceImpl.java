package com.example.db.service.impl;

import com.example.db.model.Client.Client;
import com.example.db.model.Client.ClientCompositeKey;
import com.example.db.model.ShoppingBag;
import com.example.db.model.Users;
import com.example.db.repository.ClientRepository;
import com.example.db.repository.ShoppingBagRepository;
import com.example.db.repository.UsersRepository;
import com.example.db.service.ShoppingBagService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShoppingBagServiceImpl implements ShoppingBagService {

    private final ShoppingBagRepository shoppingBagRepository;
    private final UsersRepository usersRepository;
    private final ClientRepository clientRepository;

    public ShoppingBagServiceImpl(ShoppingBagRepository shoppingBagRepository, UsersRepository usersRepository, ClientRepository clientRepository) {
        this.shoppingBagRepository = shoppingBagRepository;
        this.usersRepository = usersRepository;
        this.clientRepository = clientRepository;
    }


    @Override
    public Optional<ShoppingBag> findAll() {
        //return this.shoppingBagRepository.findAllShoppingBags();
        return null;
    }
    @Override
    public Optional<ShoppingBag> save(Integer shopping_id, String order_date, String shipping_date, String modified, Integer user_id) {
        Users users = this.usersRepository.findById(Integer.valueOf(user_id)).get();
        ClientCompositeKey clientCompositeKey = new ClientCompositeKey();
        clientCompositeKey.setUser(users);
        Client client = this.clientRepository.findById(clientCompositeKey).get();
        return null;
    }
}
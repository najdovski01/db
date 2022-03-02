package com.example.db.controller;

import com.example.db.model.OnlineStores;
import com.example.db.service.OnlineStoresService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/onlinestores")
public class OnlineStoresController {

    private final OnlineStoresService onlineStoresService;

    public OnlineStoresController(OnlineStoresService onlineStoresService) {
        this.onlineStoresService = onlineStoresService;
    }

@GetMapping
    public String getOnlineStoresPage(@RequestParam(required = false) String error, Model model){
    if(error!=null && !error.isEmpty()){
        model.addAttribute("hasError",true);
        model.addAttribute("error",error);
    }
    else{
        List<OnlineStores> stores = this.onlineStoresService.listAll();
        model.addAttribute("stores", stores);

    }
    return "onlinestores";
}
}

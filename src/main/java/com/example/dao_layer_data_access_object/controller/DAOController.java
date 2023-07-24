package com.example.dao_layer_data_access_object.controller;

import com.example.dao_layer_data_access_object.service.DAOService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class DAOController {
    final DAOService daoService;

    @GetMapping("/products/fetch-product")
    public List<String> fetchProduct(@RequestParam(value = "name", required = false) String name) {
        return daoService.getProductName(name);
    }
}

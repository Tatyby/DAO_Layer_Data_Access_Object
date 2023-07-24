package com.example.dao_layer_data_access_object.service;

import com.example.dao_layer_data_access_object.repository.DAORepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DAOService {
    private final DAORepository daoRepository;

    public List<String> getProductName(String name) {
        return daoRepository.getProductName(name);
    }


}

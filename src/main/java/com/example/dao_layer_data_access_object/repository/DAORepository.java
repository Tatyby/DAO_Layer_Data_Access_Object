package com.example.dao_layer_data_access_object.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DAORepository {
    @PersistenceContext
    EntityManager entityManager;
    private final String scriptFileName = "myScript.sql";
    String myScript = read(scriptFileName);


    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<String> getProductName(String namePerson) {
        Query query = entityManager.createNativeQuery(myScript);
        query.setParameter(1, namePerson);
        return query.getResultList();
    }

}

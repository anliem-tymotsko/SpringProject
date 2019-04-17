package com.example.labkatablemongo.repository;


import com.example.labkatablemongo.model.Dekanat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DekanatRepository extends MongoRepository<Dekanat, String> {
    void deleteById(String i);

}

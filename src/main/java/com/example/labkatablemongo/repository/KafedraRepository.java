package com.example.labkatablemongo.repository;

import com.example.labkatablemongo.model.Kafedra;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KafedraRepository extends MongoRepository<Kafedra, String> {
}

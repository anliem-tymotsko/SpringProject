package com.example.labkatablemongo.repository;

import com.example.labkatablemongo.model.Faculty;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends MongoRepository<Faculty,String> {
}

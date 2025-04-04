package com.example.formula.repository;

import com.example.formula.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {
    boolean existsByAuthid(String authid);
    Optional<User> findByAuthid(String authid);
}

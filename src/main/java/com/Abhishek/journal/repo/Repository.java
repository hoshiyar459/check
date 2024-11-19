package com.Abhishek.journal.repo;

import com.Abhishek.journal.Entity.Journal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface Repository extends MongoRepository<Journal , String > {
}

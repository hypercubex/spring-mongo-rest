package com.matt.experiment.cloud.books;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;
import java.util.Optional;

@RepositoryRestResource
public interface BookRepository extends MongoRepository<Book, ObjectId> {
    List<Book> findByName(@Param("name") String name);

    @Override
    @RestResource(exported = false)
    void deleteById(ObjectId id);
}

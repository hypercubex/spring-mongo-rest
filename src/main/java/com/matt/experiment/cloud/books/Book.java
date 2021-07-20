package com.matt.experiment.cloud.books;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.MongoId;

public class Book {
    @MongoId
    private ObjectId id;
    private String name;

    public Book(ObjectId id, String name) {
        this.id = id;
        this.name = name;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

package com.johnmcmenemy.learningwebbackend.webbackend.repository;

import com.johnmcmenemy.learningwebbackend.webbackend.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

// This repository interacts with our database
public interface ToDoRepository extends MongoRepository<ToDo, String> {}

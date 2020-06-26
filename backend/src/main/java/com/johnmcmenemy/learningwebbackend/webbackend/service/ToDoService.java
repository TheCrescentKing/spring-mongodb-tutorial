package com.johnmcmenemy.learningwebbackend.webbackend.service;

// This is where our business logic is happening
// Here and only here should we work with the data

import com.johnmcmenemy.learningwebbackend.webbackend.data.ToDo;
import com.johnmcmenemy.learningwebbackend.webbackend.exception.EntityNotFoundException;
import com.johnmcmenemy.learningwebbackend.webbackend.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> findAll(){
        return toDoRepository.findAll();
    }

    public ToDo findById(String id){
        return toDoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public ToDo save(ToDo toDo){
        return toDoRepository.save(toDo);
    }

    public void deleteById(String id){
        toDoRepository.deleteById(id);
    }
}

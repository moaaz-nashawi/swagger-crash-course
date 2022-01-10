package com.oneoonecode.swaggercrashcourse.controller;

import com.oneoonecode.swaggercrashcourse.models.ToDoItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class GetAllToDoItems {
    @GetMapping(value = "todos")
    public ResponseEntity<Object> getAllToDoItems(Boolean isCompleted) {
        ArrayList<ToDoItem> toDoItems = new ArrayList<>();
        toDoItems.add(new ToDoItem("1","Item 1","Item 1 description",false));
        toDoItems.add(new ToDoItem("2","Item 2","Item 2 description",true));
        toDoItems.add(new ToDoItem("3","Item 3","Item 3 description",false));

        return ResponseEntity.ok().body(toDoItems);
    }
}

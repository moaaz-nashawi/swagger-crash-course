package com.oneoonecode.swaggercrashcourse.controller;

import com.oneoonecode.swaggercrashcourse.models.ToDoItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateToDoItem {
    @PutMapping(value = "/todos/{toDoItemId}")
    public ResponseEntity<Object> updateToDoItem(@PathVariable String toDoItemId) {
        return ResponseEntity.ok().body("Item Updated!");
    }
}

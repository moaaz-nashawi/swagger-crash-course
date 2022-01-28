package com.oneoonecode.swaggercrashcourse.controllers;

import com.oneoonecode.swaggercrashcourse.models.ToDoItem;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateToDoItem {
        @PostMapping(value = "/todos")
        @Operation(
                tags = {"TodoItems"}

        )
        public ResponseEntity<Object> createToDoItem(@RequestBody ToDoItem toDoItem) {
                return ResponseEntity.ok().body(toDoItem);
        }
        }

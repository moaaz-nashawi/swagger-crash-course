package com.oneoonecode.swaggercrashcourse.controller;

import com.oneoonecode.swaggercrashcourse.models.ToDoItem;
import com.oneoonecode.swaggercrashcourse.models.ToDoItem1;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;



import io.swagger.v3.oas.annotations.responses.ApiResponse;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


import java.lang.reflect.Method;

@RestController
public class CreateToDoItem {
        @PostMapping(value = "/todos")
        @ApiResponse(responseCode = "200")
        //@io.swagger.v3.oas.annotations.parameters.RequestBody
        public ResponseEntity<ToDoItem> createToDoItem(
                @RequestBody
                @io.swagger.v3.oas.annotations.parameters.RequestBody(content = @Content(mediaType = MediaType.MULTIPART_FORM_DATA_VALUE,schema = @Schema(implementation = ToDoItem.class)))
                        ToDoItem toDoItem) {
                System.out.println(toDoItem.getItemId());
                return ResponseEntity.ok().body(toDoItem);
        }
        }

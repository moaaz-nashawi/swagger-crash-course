package com.oneoonecode.swaggercrashcourse.controllers;

import com.oneoonecode.swaggercrashcourse.models.Customer;
import com.oneoonecode.swaggercrashcourse.models.ToDoItem;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UpdateToDoItem {
    @PutMapping(value = "/todos/{toDoItemId}")
    @Operation(
           tags = {"TodoItems","TodoItems 2"},
            operationId = "updateToDo",
            summary = "This is the summary",
            description = "This is the description",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "This is the request body desc.",
            content = @Content(schema = @Schema(implementation = ToDoItem.class))),
            parameters = {@Parameter(name = "toDoItemId", description = "The path variable.",example = "5554",
            in = ParameterIn.PATH)},
            externalDocs = @ExternalDocumentation(url = "http://oneoone.com/docs",description = "For more details check the link."),
            responses = {@ApiResponse(responseCode = "200",
                    content = @Content(schema =
                    @Schema(implementation = ToDoItem.class),mediaType = MediaType.APPLICATION_JSON_VALUE,
                    examples = {@ExampleObject(name = "Success 1",value = "Object"),
                            @ExampleObject(name = "Success 2",value = "String")}),
                    description = "Success Response."),
                    },
            security = {@SecurityRequirement(name = "BearerJWT")}

    )
    public ResponseEntity<Object> updateToDoItem(@PathVariable String toDoItemId,
                                                 @RequestBody ToDoItem toDoItem,
                                                 @CookieValue(required = false) String canEdit,
                                                 @RequestHeader Boolean fromHost,
                                                 @RequestParam Boolean isClient) {

        return ResponseEntity.ok().body(toDoItem);
    }
}

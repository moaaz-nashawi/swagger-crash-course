package com.oneoonecode.swaggercrashcourse.models;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoItem {


    private String itemId;
    private String title;
    private String description;
    private Boolean completed;

}

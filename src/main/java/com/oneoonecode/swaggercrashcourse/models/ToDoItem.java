package com.oneoonecode.swaggercrashcourse.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoItem {

    private String itemId;
    private String title;
    private String description;
    private Boolean completed;

}

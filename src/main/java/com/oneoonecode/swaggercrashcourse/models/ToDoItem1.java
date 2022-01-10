package com.oneoonecode.swaggercrashcourse.models;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoItem1 extends ToDoItem {

    @Hidden
    private String title;


}

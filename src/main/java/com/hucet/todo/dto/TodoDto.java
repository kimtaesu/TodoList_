package com.hucet.todo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TodoDto {
    private String title;
    private String desc;
}

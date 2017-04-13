package com.hucet.todo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class TodoEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String detail;
}

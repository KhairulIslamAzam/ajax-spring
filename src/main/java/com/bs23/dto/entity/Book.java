package com.bs23.dto.entity;

import lombok.*;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {

    private Integer bookId;
    private String bookName;
    private String author;
}

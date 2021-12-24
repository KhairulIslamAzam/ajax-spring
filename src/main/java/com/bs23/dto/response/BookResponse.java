package com.bs23.dto.response;

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
public class BookResponse<T> {

    private String status;
    private T data;
}

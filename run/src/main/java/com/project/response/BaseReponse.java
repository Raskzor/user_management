package com.project.response;

import lombok.*;

/**
 * @author Raskzor
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class BaseReponse {
    private String message;
    private Object result;
}

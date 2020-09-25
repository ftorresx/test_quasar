package org.quasar.test.dto;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class AnswerDTO implements Serializable {

    private PositionDTO position;
    private String message;

}

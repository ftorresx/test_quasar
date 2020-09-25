package org.quasar.test.dto;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class SateliteDTO implements Serializable {

    private String name;
    private Double distance;
    private String[] message;

}

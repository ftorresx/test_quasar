package org.quasar.test.dto;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class PositionDTO implements Serializable {

    private Double x;
    private Double y;

}

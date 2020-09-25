package org.quasar.test.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class QuasarDTO implements Serializable {

    private List<SateliteDTO> satellites;

    public List<SateliteDTO> getSatellites() {
        return satellites;
    }

    public void setSatellites(List<SateliteDTO> satellites) {
        this.satellites = satellites;
    }
}

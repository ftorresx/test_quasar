package org.quasar.test.utils;

import org.quasar.test.dto.QuasarDTO;
import org.quasar.test.dto.SateliteDTO;

import java.util.ArrayList;
import java.util.List;

public final class Utils {

    public static Double[] getDistances(final QuasarDTO quasarDTO) {

        List<Double> distances = new ArrayList<>();
        for (SateliteDTO sateliteDTO: quasarDTO.getSatellites()) {
            if (sateliteDTO.getName().equalsIgnoreCase("Kenobi"))
                distances.add(0, sateliteDTO.getDistance());
            if (sateliteDTO.getName().equalsIgnoreCase("Skywalker"))
                distances.add(1, sateliteDTO.getDistance());
            if (sateliteDTO.getName().equalsIgnoreCase("Sato"))
                distances.add(2, sateliteDTO.getDistance());
        }
        return distances.toArray(new Double[distances.size()]);
    }


    public static List<String[]> getMessages(final QuasarDTO quasarDTO){
        List<String[]> messages = new ArrayList<>();

        for (SateliteDTO sateliteDTO: quasarDTO.getSatellites()) {
            messages.add(sateliteDTO.getMessage());
        }
        return messages;
    }
}

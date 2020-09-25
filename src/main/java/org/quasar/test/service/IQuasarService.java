package org.quasar.test.service;

import java.util.List;

public interface IQuasarService {

    public Double[] getLocation(final Double ... distances);

    public String getMessage(List<String[]> messages);

}

package ru.neurosystems.producer.restclient.services;

import ru.neurosystems.dto.Data;

import java.util.List;

public interface ApiService {
    List<Data> getData(Integer limit);
}

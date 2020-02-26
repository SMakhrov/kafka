package ru.neurosystems.consumer.kafka.service;

import ru.neurosystems.dto.Data;

public interface DataService {
    Data saveMessage(Data data);
}

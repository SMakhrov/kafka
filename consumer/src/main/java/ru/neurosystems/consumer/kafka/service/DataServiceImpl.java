package ru.neurosystems.consumer.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.neurosystems.consumer.kafka.dao.DataRepository;
import ru.neurosystems.dto.Data;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private DataRepository repository;

    @Override
    public Data saveMessage(Data data) {
        return repository.save(data);
    }
}
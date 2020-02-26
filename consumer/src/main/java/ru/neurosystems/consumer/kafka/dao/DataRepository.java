package ru.neurosystems.consumer.kafka.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.neurosystems.dto.Data;

@Repository
public interface DataRepository extends CrudRepository<Data, String> {
}

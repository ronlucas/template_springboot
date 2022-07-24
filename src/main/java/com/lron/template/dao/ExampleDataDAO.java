package com.lron.template.dao;

import com.lron.template.entities.ExampleData;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ExampleDataDAO extends CrudRepository<ExampleData, UUID> {
}

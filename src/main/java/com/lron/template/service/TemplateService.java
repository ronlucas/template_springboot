package com.lron.template.service;

import com.lron.template.dao.ExampleDataDAO;
import com.lron.template.entities.ExampleData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TemplateService {
    private ExampleDataDAO exampleDataDAO;

    public TemplateService(ExampleDataDAO exampleDataDAO) {
        this.exampleDataDAO = exampleDataDAO;
    }

    public List<ExampleData> getExamples() {
        List<ExampleData> result = new ArrayList<ExampleData>();
        exampleDataDAO.findAll().forEach(result::add);
        return result;
    }
}
